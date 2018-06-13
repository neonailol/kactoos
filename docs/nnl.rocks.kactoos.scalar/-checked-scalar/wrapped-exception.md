[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [CheckedScalar](index.md) / [wrappedException](./wrapped-exception.md)

# wrappedException

`private fun wrappedException(exp: `[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`): `[`E`](index.md#E)

Wraps exception.
Skips unnecessary wrapping of exceptions of the same type.
Allows wrapping of exceptions of the same type if the error message
has been changed.

### Parameters

`exp` - Exception

**Return**
E Wrapped exception

