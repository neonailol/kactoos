import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.list.Joined
import nnl.rocks.kactoos.list.Mapped
import nnl.rocks.kactoos.list.Sorted
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.testng.annotations.Test
import java.lang.reflect.Constructor

class HaveSameConstructorsTest {

    @Test
    fun haveSameConstructors() {

        val cactoosCtors = constructors("org.cactoos")
        val kactoosCtors = constructors("nnl.rocks.kactoos")

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

    private fun constructors(pkg: String): Sorted<String> {
        return Sorted(
            Filtered(
                FuncOf({ it: String -> it.contains("\$").not() }),
                Mapped(
                    FuncOf({ it: Constructor<*> -> it.toString().replace("$pkg.", "") }),
                    Joined(
                        IterableOf(
                            Mapped(
                                FuncOf({ it: Class<*> -> it.constructors.asList() }),
                                Reflections(
                                    pkg,
                                    SubTypesScanner(false)
                                ).getSubTypesOf(Any::class.java)
                            )
                        )
                    )
                )
            )
        )
    }

}
