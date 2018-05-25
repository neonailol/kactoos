[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SumOfDoubleScalar](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SumOfDoubleScalar(vararg scalars: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)``SumOfDoubleScalar(scalars: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>>)`

Double Scalar which sums up the values of other Scalars of the same type.

Here is how you can use it to summarize double numbers:

`val sum = SumOfDoubleScalar(arrayOf({ 1.0 }, { 2.1 }, { 3.1 })).invoke()`

There is no thread-safety guarantee.

### Parameters

`scalars` - Scalars to sum up values from

**Since**
0.5

