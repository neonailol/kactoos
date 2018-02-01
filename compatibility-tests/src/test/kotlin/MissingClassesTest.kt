import org.junit.Test
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.assertTrue

class MissingClassesTest {

    @Test
    fun missingClasses() {
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

        val count = AtomicInteger(0)

        cactoosTypes.forEach {
            if (! kactoosTypes.contains(it)) {
                println(it)
                count.incrementAndGet()
            }

        }

        assertTrue("Missing $count classes") { count.get() == 0 }
    }

}
