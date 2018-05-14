import helpers.CactoosClasses
import nnl.rocks.kactoos.collection.Mapped
import nnl.rocks.kactoos.func.FuncOf
import org.testng.annotations.Test
import kotlin.reflect.KClass
import kotlin.test.assertEquals

class HaveSameInterfacesTest {

    @Test
    fun haveSameInterfaces() {
        CactoosClasses().forEach { kType: String ->
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
        val map =
            FuncOf({ type: KClass<*> ->
                       Mapped(
                           FuncOf({ it: Class<*> -> it.toString().replaceBeforeLast('.', "") }),
                           type.java.interfaces.asList()
                       )
                   })
        val firstTypes = map.apply(first)
        val secondTypes = map.apply(second)
        assertEquals(firstTypes, secondTypes)
    }

}
