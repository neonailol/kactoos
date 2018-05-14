import nnl.rocks.kactoos.collection.Filtered
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.list.Mapped
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.testng.annotations.Test
import java.util.concurrent.atomic.AtomicInteger

class MissingClassesTest {

    @Test
    fun missingClasses() {

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

        val kactoosTypes =
            Mapped(
                FuncOf({ it: String -> it.replace("nnl.rocks.kactoos.", "") }),
                Filtered(
                    FuncOf({ it: String -> it.endsWith("Kt").not() }),
                    Reflections(
                        "nnl.rocks.kactoos",
                        SubTypesScanner(false)
                    ).allTypes
                )
            )

        val count = AtomicInteger(0)

        cactoosTypes.forEach {
            if (kactoosTypes.contains(it).not()) {
                println(it)
                count.incrementAndGet()
            }
        }

        //assertTrue("Missing $count classes") { count.get() == 0 }
    }

}
