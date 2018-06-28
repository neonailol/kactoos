[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SumOfIntScalar](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SumOfIntScalar(vararg scalars: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>)`
`SumOfIntScalar(vararg scalars: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>)``SumOfIntScalar(scalars: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>)`

Integer Scalar which sums up the values of other Scalars of the same type

Here is how you can use it to summarize numbers:

`val sum = SumOfIntScalar({ 1 }, { 2 }, { 3 }).invoke()`

There is no thread-safety guarantee.

### Parameters

`scalars` - Scalars to sum up values from

**Since**
0.4

