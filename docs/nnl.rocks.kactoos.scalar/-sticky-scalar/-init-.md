[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [StickyScalar](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`StickyScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)``StickyScalar(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`T`](index.md#T)`>)`

Cached version of a Scalar.

This [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) decorator technically is an in-memory
cache.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncScalar](../-sync-scalar/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`func` - Cached func

**See Also**

[StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.md)

**Since**
0.3

