[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SumOfFloatScalar](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SumOfFloatScalar(vararg scalars: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>)`
`SumOfFloatScalar(vararg scalars: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>)``SumOfFloatScalar(scalars: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>>)`

Float Scalar which sums up the values of other Scalars of the same type

Here is how you can use it to summarize float numbers:

`val sum = SumOfFloatScalar({ 1f }, { 2f }, { 3f }).invoke()`

There is no thread-safety guarantee.

### Parameters

`scalars` - Scalars to sum up values from

**Since**
0.5

