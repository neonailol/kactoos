package nnl.rocks.kactoos.test

import nnl.rocks.kactoos.KScalar
import nnl.rocks.kactoos.Scalar
import kotlin.test.assertEquals

class AssertScalarsEquals<T : Any>(
    expected: KScalar<T>,
    actual: KScalar<T>,
    message: String
) {

    constructor(
        expected: Scalar<T>,
        actual: Scalar<T>,
        message: String
    ) : this(
        { expected() },
        { actual() },
        message
    )

    init {
        assertEquals(expected(), actual(), message)
    }
}
