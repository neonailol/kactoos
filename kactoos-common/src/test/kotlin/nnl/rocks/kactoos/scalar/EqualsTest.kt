package nnl.rocks.kactoos.scalar

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class EqualsTest {

    @Test
    fun compareEquals() {
        assertTrue(
            Equals({ 1 }) { 1 }.invoke(),
            "Can't compare if two integers are equals"
        )
    }

    @Test
    fun compareNotEquals() {
        assertFalse(
            Equals({ 1 }) { 2 }.invoke(),
            "Can't compare if two integers are not equals"
        )
    }

    @Test
    fun compareEqualsText() {
        val str = "hello"
        assertTrue(
            Equals({ str }) { str }.invoke(),
            "Can't compare if two strings are equals"
        )
    }

    @Test
    fun compareNotEqualsText() {
        assertFalse(
            Equals({ "hello" }) { "world" }.invoke(),
            "Can't compare if two strings are not equals"
        )
    }
}
