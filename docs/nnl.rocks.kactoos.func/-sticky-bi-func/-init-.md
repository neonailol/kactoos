[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [StickyBiFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`StickyBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>)``StickyBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Func that accepts two arguments and caches previously calculated values
and doesn't recalculate again.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncBiFunc](../-sync-bi-func/index.md).

This [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md) decorator technically is an in-memory
cache.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

**See Also**

[StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md)

**Since**
0.13

