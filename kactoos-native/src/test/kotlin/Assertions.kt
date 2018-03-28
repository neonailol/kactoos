package kotlin.test

fun assertSame(message: String?, expected: Any?, actual: Any?): Unit {
    assertTrue({ messagePrefix(message) + "Expected <$expected>, actual <$actual> is not same." }, actual === expected)
}

fun assertTrue(lazyMessage: () -> String?, actual: Boolean): Unit {
    if (! actual) {
        fail(lazyMessage())
    }
}

internal fun messagePrefix(message: String?) = if (message == null) "" else "$message. "
