[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [ScalarWithFallback](index.md) / [fallback](./fallback.md)

# fallback

`private fun fallback(exp: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`T`](index.md#T)

Finds the best fallback for the given exception type and apply it to
the exception or throw the original error if no fallback found.

### Parameters

`exp` - The original exception

### Exceptions

`Exception` - The original exception if no fallback found

**Return**
Result of the most suitable fallback

