[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [StickyScalar](./index.md)

# StickyScalar

`class StickyScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>`

Cached version of a KScalar.

This [KScalar](../../nnl.rocks.kactoos/-k-scalar.md) decorator technically is an in-memory cache.

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyScalar(scalar: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)` |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
