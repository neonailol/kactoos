[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SyncScalar](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SyncScalar(src: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`
`SyncScalar(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)`
`SyncScalar(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>, mutex: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)``SyncScalar(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, mutex: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`

Scalar that is thread-safe.

### Parameters

`T` - Type of result

`origin` - The KScalar to cache

`mutex` - Sync lock

**Since**
0.3

