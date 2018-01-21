[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [StickyFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`StickyFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`StickyFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)``StickyFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, Y>)`

Func that caches previously calculated values and doesn't
recalculate again.

This [Func](../../nnl.rocks.kactoos/-func/index.md) decorator technically is an in-memory
cache.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncFunc](../-sync-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

**See Also**

[StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md)

**Since**
0.1

