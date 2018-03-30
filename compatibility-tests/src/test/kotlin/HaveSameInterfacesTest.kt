import org.apache.commons.lang3.ClassUtils
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.testng.annotations.Test
import kotlin.reflect.KClass
import kotlin.test.assertEquals

class HaveSameInterfacesTest {

    @Test
    fun haveSameInterfaces() {
        val cactoosTypes = Reflections(
            "org.cactoos",
            SubTypesScanner(false)
        ).allTypes.map {
            it.replace("org.cactoos.", "")
        }
            .sorted()
            .toMutableList()

        cactoosTypes.removeIf {
            it.contains("\$")
        }

        val kactoosTypes = Reflections(
            "nnl.rocks.kactoos",
            SubTypesScanner(false)
        ).allTypes.map {
            it.replace("nnl.rocks.kactoos.", "")
        }
            .sorted()
            .toMutableList()

        kactoosTypes.removeIf {
            it.endsWith("Kt")
        }

        cactoosTypes.forEach { kType: String ->
            try {
                val cClass = Class.forName("org.cactoos.$kType")
                val kClass = Class.forName("nnl.rocks.kactoos.$kType")
                haveSameInterfaces(cClass.kotlin, kClass.kotlin)
            } catch (t: Throwable) {
            }
        }
    }

    private fun haveSameInterfaces(
        first: KClass<*>,
        second: KClass<*>
    ) {
        val map = { type: KClass<*> ->
            ClassUtils.getAllInterfaces(type.java).map {
                it.toString()
            }.map {
                it.replaceBeforeLast('.', "")
            }
        }
        val firstTypes = map(first)
        val secondTypes = map(second)
        assertEquals(firstTypes, secondTypes)

        if (firstTypes.size > 1 || secondTypes.size > 1) {
            println()
        }
    }
}
