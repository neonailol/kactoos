import org.apache.commons.lang3.ClassUtils
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.testng.annotations.Test
import kotlin.reflect.KClass
import kotlin.test.assertEquals

class HaveSameSupertypesTest {

    @Test
    fun haveSameSupertypes() {
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
                haveSameSupertypes(cClass.kotlin, kClass.kotlin)
            } catch (t: Throwable) {
            }
        }

    }

    private fun haveSameSupertypes(
        first: KClass<*>,
        second: KClass<*>
    ) {
        val map = { type: KClass<*> ->
            ClassUtils.getAllSuperclasses(type.java).map {
                it.toString()
            }.map {
                it.replaceBeforeLast('.', "")
            }
        }
        val firstTypes = map(first)
        val secondTypes = map(second)
        assertEquals(firstTypes, secondTypes)
    }
}
