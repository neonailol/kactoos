package nnl.rocks.kactoos.text

import nnl.rocks.kactoos.test.AssertTextsEquals
import kotlin.test.Test

class AbbreviatedTextTest {

    @Test
    fun abbreviatesAnEmptyText() {
        AssertTextsEquals(
            AbbreviatedText("", 8),
            TextOf { "" },
            "Can't abbreviate empty string"
        )
    }

    @Test
    fun abbreviatesText() {
        AssertTextsEquals(
            AbbreviatedText("Hello, World!", 8),
            TextOf { "Hello..." },
            "Can't abbreviate a string"
        )
    }

    @Test
    fun abbreviatesTextOneCharSmaller() {
        AssertTextsEquals(
            AbbreviatedText("oo programming", 10),
            TextOf { "oo prog..." },
            "Can't abbreviate a text one char smaller"
        )
    }

    @Test
    fun abbreviatesTextWithSameLength() {
        AssertTextsEquals(
            AbbreviatedText("elegant objects", 15),
            TextOf { "elegant objects" },
            "Can't abbreviate a text with same length"
        )
    }

    @Test
    fun abbreviatesTextOneCharBigger() {
        AssertTextsEquals(
            AbbreviatedText("the old mcdonald", 17),
            TextOf { "the old mcdonald" },
            "Can't abbreviate a text one char bigger"
        )
    }

    @Test
    fun abbreviatesTextTwoCharsBigger() {
        AssertTextsEquals(
            AbbreviatedText("hi everybody!", 15),
            TextOf { "hi everybody!" },
            "Can't abbreviate a text two chars bigger"
        )
    }

    @Test
    fun abbreviatesTextWithWidthBiggerThanLength() {
        AssertTextsEquals(
            AbbreviatedText("cactoos framework", 50),
            TextOf { "cactoos framework" },
            "Can't abbreviate a text with width bigger than length"
        )
    }

    @Test
    fun abbreviatesTextBiggerThanDefaultMaxWidth() {
        AssertTextsEquals(
            AbbreviatedText("The quick brown fox jumps over the lazy black dog and after that returned to the cave"),
            TextOf { "The quick brown fox jumps over the lazy black dog and after that returned to ..." },
            "Can't abbreviate a text bigger than default max width"
        )
    }
}
