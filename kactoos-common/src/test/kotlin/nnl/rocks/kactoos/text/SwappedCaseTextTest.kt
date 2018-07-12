package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class SwappedCaseTextTest {

    @Test
    fun swapsCase() {
        AssertTextsEquals(
            SwappedCaseText(TextOf { "hELLo!" }),
            TextOf { "HellO!" },
            "Can't swap case"
        )
    }

    @Test
    fun swapsEmptyText() {
        AssertTextsEquals(
            SwappedCaseText(TextOf { "" }),
            TextOf { "" },
            "Can't swap case of empty text"
        )
    }
}
