import helpers.PackageConstructors
import org.testng.annotations.Test

class HaveSameConstructorsTest {

    @Test
    fun haveSameConstructors() {

        val cactoosCtors = PackageConstructors("org.cactoos").value()
        val kactoosCtors = PackageConstructors("nnl.rocks.kactoos").value()

        val skip = listOf(
            "scalar.And",
            "scalar.Or",
            "scalar.SumOf",
            "scalar.MinOf",
            "scalar.MaxOf",
            "scalar.AvgOf",
            "collection.Sorted(java.lang.Object[])",
            "collection.Sorted(java.util.Comparator,java.lang.Object[])",
            "iterable.Sorted(java.lang.Object[])",
            "iterable.Sorted(java.util.Comparator,java.lang.Object[])",
            "list.Sorted(java.lang.Object[])",
            "list.Sorted(java.util.Comparator,java.lang.Object[])",
            "scalar.NumberEnvelope(Scalar,Scalar,Scalar,Scalar)"
        )

        cactoosCtors
            .filter { skip.none { s -> s in it } && kactoosCtors.contains(it).not() }
            .forEach { println("Missing $it") }

//        assertTrue("Have $ok unresolved constructor issues!", { ok == 0 })
    }
}
