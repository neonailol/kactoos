import org.junit.Test
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
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

        cactoosTypes.forEach {
            assertTrue("Missing $it") { kactoosTypes.contains(it) }
        }
    }

}
