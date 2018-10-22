import helpers.PackageConstructors
import org.testng.annotations.Test

class HaveSameConstructorsTest {

    @Test
    fun haveSameConstructors() {

        val cactoosCtors = PackageConstructors("org.cactoos")
        val kactoosCtors = PackageConstructors("nnl.rocks.kactoos")

        val skip = listOf(
            "collection.CollectionOf(java.util.Iterator)",
            "collection.Filtered(Func,java.util.Iterator)",
            "collection.Mapped(Func,java.util.Iterator)",
            "collection.Solid(java.util.Iterator)",
            "collection.Sorted(java.util.Comparator,java.util.Iterator)",
            "collection.Sticky(java.util.Iterator)",
            "collection.Synced(java.util.Iterator)",
            "collection.Sorted(java.lang.Iterable)",
            "collection.Sorted(java.lang.Object[])"
        )

        cactoosCtors
            .filter { skip.none { s -> s in it } && kactoosCtors.contains(it).not() }
            .forEach { println("Missing $it") }

//        assertTrue("Have $ok unresolved constructor issues!", { ok == 0 })
    }
}
