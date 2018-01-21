import nnl.rocks.kactoos.io.ResourceOf
import org.junit.Test
import kotlin.test.assertTrue

class HaveSameTestsTest {

    @Test
    fun `projects have same set of tests`() {

        val cStream = ResourceOf("cactoos.txt").stream()
        val kStream = ResourceOf("kactoos.txt").stream()

        val cTests = mutableListOf<String>()
        cStream.bufferedReader().useLines { lines ->
            lines.forEach {
                cTests.add(it.replace("org.cactoos.", ""))
            }
        }

        val kTests = mutableListOf<String>()
        kStream.bufferedReader().useLines { lines ->
            lines.forEach {
                kTests.add(it.replace("nnl.rocks.kactoos.", ""))
            }
        }

        val skip = listOf(
            "failForNullResult(BytesTest)",
            "failForNullArgument(BytesTest)",
            "testAdd(collection.JoinedTest)",
            "testClear(collection.JoinedTest)",
            "testRetainAll(collection.JoinedTest)",
            "testAddAll(collection.JoinedTest)",
            "testRemove(collection.JoinedTest)",
            "testRemoveAll(collection.JoinedTest)",
            "testAdd(collection.LimitedTest)",
            "testClear(collection.LimitedTest)",
            "testRetainAll(collection.LimitedTest)",
            "testAddAll(collection.LimitedTest)",
            "testRemove(collection.LimitedTest)",
            "testRemoveAll(collection.LimitedTest)",
            "testAdd(collection.ReversedTest)",
            "testClear(collection.ReversedTest)",
            "testRetainAll(collection.ReversedTest)",
            "testAddAll(collection.ReversedTest)",
            "testRemove(collection.ReversedTest)",
            "testRemoveAll(collection.ReversedTest)",
            "testAdd(collection.StickyCollectionTest)",
            "testClear(collection.StickyCollectionTest)",
            "testRetainAll(collection.StickyCollectionTest)",
            "testAddAll(collection.StickyCollectionTest)",
            "testRemove(collection.StickyCollectionTest)",
            "testRemoveAll(collection.StickyCollectionTest)",
            "failForNullInput(InputTest)",
            "partitionedListsAreUnmodifiable(iterator.PartitionedTest)",
            "retainAll(list.JoinedTest)",
            "addAll(list.JoinedTest)",
            "remove(list.JoinedTest)",
            "removeSecond(list.JoinedTest)",
            "addAllSecond(list.JoinedTest)",
            "addSecond(list.JoinedTest)",
            "add(list.JoinedTest)",
            "set(list.JoinedTest)",
            "clear(list.JoinedTest)",
            "removeAll(list.JoinedTest)",
            "testAdd(list.StickyListTest)",
            "testSet(list.StickyListTest)",
            "testClear(list.StickyListTest)",
            "testRemoveIndex(list.StickyListTest)",
            "testRetainAll(list.StickyListTest)",
            "testAddIndex(list.StickyListTest)",
            "testAddAll(list.StickyListTest)",
            "testRemove(list.StickyListTest)",
            "testRemoveAll(list.StickyListTest)",
            "cantSetValue(map.MapEntryTest)",
            "failForNullStream(OutputTest)",
            "failForNullStream(OutputTest)",
            "failForNullOutput(OutputTest)",
            "failForNullProc(ProcTest)",
            "failForNullInput(ProcTest)",
            "failForNullResult(ScalarTest)",
            "failForNullArgument(ScalarTest)",
            "failForNullResult(TextTest)",
            "failForNullArgument(TextTest)"
        )

        var ok = 0

        for (cTest in cTests) {
            if (skip.none { s -> s in cTest }) {
                if (kTests.contains(cTest).not()) {
                    println("Missing $cTest")
                    ok ++
                }
            }
        }

        assertTrue("Have $ok unresolved tests issues!", { ok == 0 })
    }
}
