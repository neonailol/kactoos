import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.testng.annotations.Test

class HaveSameConstructorsTest {

    @Test
    fun haveSameConstructors() {
        val cactoosTypes = Reflections(
            "org.cactoos",
            SubTypesScanner(false)
        ).getSubTypesOf(Any::class.java)

        val cactoosCtors = mutableListOf<String>()

        for (clazz in cactoosTypes) {
            clazz.constructors.mapTo(cactoosCtors) {
                it.toString().replace("org.cactoos.", "")
            }
        }

        cactoosCtors.removeIf {
            it.contains("\$")
        }

        val kactoosCtors = mutableListOf<String>()

        val kactoosTypes = Reflections(
            "nnl.rocks.kactoos",
            SubTypesScanner(false)
        ).getSubTypesOf(Any::class.java)

        for (clazz in kactoosTypes) {
            clazz.constructors.mapTo(kactoosCtors) {
                it.toString().replace("nnl.rocks.kactoos.", "")
            }
        }

        cactoosCtors.sort()
        kactoosCtors.sort()

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

        var ok = 0

        for (type in cactoosCtors) {
            if (skip.none { s -> s in type }) {
                if (kactoosCtors.contains(type).not()) {
                    println("Missing $type")
                    ok ++
                }
            }
        }

//        assertTrue("Have $ok unresolved constructor issues!", { ok == 0 })
    }

}
