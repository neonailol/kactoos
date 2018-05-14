import nnl.rocks.kactoos.collection.Filtered
import nnl.rocks.kactoos.collection.Mapped
import nnl.rocks.kactoos.func.FuncOf
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.testng.annotations.Test
import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlin.test.assertEquals

class HaveSameSupertypesTest {

    @Test
    fun haveSameSupertypes() {

        val cactoosTypes =
            Mapped(
                FuncOf({ it: String -> it.replace("org.cactoos.", "") }),
                Filtered(
                    FuncOf({ it: String -> it.contains('$').not() }),
                    Reflections(
                        "org.cactoos",
                        SubTypesScanner(false)
                    ).allTypes
                )
            )

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
        val map =
            FuncOf({ type: KClass<*> ->
                       Mapped(
                           FuncOf({ it: KType -> it.toString().replaceBeforeLast('.', "") }),
                           type.supertypes
                       )
                   })
        val firstTypes = map.apply(first)
        val secondTypes = map.apply(second)
        assertEquals(firstTypes, secondTypes)
    }
}
