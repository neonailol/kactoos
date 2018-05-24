import helpers.CactoosClasses
import helpers.KactoosClasses
import org.testng.annotations.Test
import java.util.concurrent.atomic.AtomicInteger

class MissingClassesTest {

    @Test
    fun missingClasses() {
        val cactoosTypes = CactoosClasses()
        val kactoosTypes = KactoosClasses()
        val count = AtomicInteger(0)
        cactoosTypes.sorted().forEach {
            if (kactoosTypes.contains(it).not()) {
                println(it)
                count.incrementAndGet()
            }
        }
        //assertTrue("Missing $count classes") { count.get() == 0 }
    }

}
