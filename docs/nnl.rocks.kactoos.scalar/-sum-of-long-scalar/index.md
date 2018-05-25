[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SumOfLongScalar](./index.md)

# SumOfLongScalar

`class SumOfLongScalar : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`

Long Scalar which sums up the values of other Scalars of the same type

Here is how you can use it to summarize numbers:

`val sum = SumOfLongScalar({ 1L }, { 2L }, { 3L }).invoke()`

There is no thread-safety guarantee.

### Parameters

`scalars` - Scalars to sum up values from

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SumOfLongScalar(vararg scalars: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>)`<br>`SumOfLongScalar(vararg scalars: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>)``SumOfLongScalar(scalars: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>>)`<br>Long Scalar which sums up the values of other Scalars of the same type |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
