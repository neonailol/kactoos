[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SumOfScalar](./index.md)

# SumOfScalar

`internal class SumOfScalar<T : `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`SumOf`](../-sum-of/index.md)`>`

Make a scalar which is sum of scalar's values.

There is no thread-safety guarantee.

Note this class is for internal usage only

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SumOfScalar(vararg scalars: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)`<br>`SumOfScalar(vararg scalars: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)``SumOfScalar(scalars: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>)`<br>Make a scalar which is sum of scalar's values. |

### Properties

| Name | Summary |
|---|---|
| [scalars](scalars.md) | `val scalars: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>` |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`SumOf`](../-sum-of/index.md)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
