import helpers.CactoosClasses
import nnl.rocks.kactoos.collection.Mapped
import nnl.rocks.kactoos.func.FuncOf
import org.testng.annotations.Test
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.reflect.full.allSupertypes
import kotlin.test.assertEquals

class HaveSameSupertypesTest {

    @Test
    fun haveSameSupertypes() {
        CactoosClasses().forEach { kType: String ->
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
        val map =
            FuncOf({ type: KClass<*> ->
                       Mapped(
                           FuncOf({ it: KType -> it.toString().replaceBeforeLast('.', "") }),
                           type.allSupertypes
                       )
                   })
        val firstTypes = map.apply(first)
        val secondTypes = map.apply(second)
        assertEquals(firstTypes, secondTypes)
    }
}
