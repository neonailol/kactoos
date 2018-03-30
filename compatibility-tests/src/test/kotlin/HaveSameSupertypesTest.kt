import org.testng.annotations.Test
import kotlin.reflect.KClass
import kotlin.test.assertEquals

class HaveSameSupertypesTest {

    @Test
    fun haveSameSupertypes() {
        haveSameSupertypes(
            org.cactoos.bytes.Base64Bytes::class,
            nnl.rocks.kactoos.bytes.Base64Bytes::class
        )

    }

    private fun haveSameSupertypes(
        first: KClass<*>,
        second: KClass<*>
    ) {
        val map = { type: KClass<*> ->
            type.supertypes.map {
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
