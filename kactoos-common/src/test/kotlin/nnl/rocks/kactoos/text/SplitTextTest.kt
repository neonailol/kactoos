package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.test.BehavesAsIterable
import kotlin.test.Test

class SplitTextTest {

    @Test
    fun splitStringWithRegex() {
        BehavesAsIterable<Text>(
            SplitText(
                "Hello World!",
                "\\s+"
            ),
            arrayOf(TextOf { "Hello" }, TextOf { "World!" })
        )
    }

    @Test
    fun splitEmptyStringWithRegex() {
        BehavesAsIterable(
            SplitText(
                "",
                "\\W+"
            ),
            arrayOf()
        )
    }

}
