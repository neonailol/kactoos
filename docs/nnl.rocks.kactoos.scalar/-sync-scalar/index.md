[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SyncScalar](./index.md)

# SyncScalar

`class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>`

Scalar that is thread-safe.

### Parameters

`T` - Type of result

`origin` - The KScalar to cache

`mutex` - Sync lock

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncScalar(src: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`<br>`SyncScalar(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)`<br>`SyncScalar(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>, mutex: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)``SyncScalar(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, mutex: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Scalar that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
