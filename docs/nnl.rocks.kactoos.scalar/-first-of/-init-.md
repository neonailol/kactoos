[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [FirstOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`FirstOf(condition: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`T`](index.md#T)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, fallback: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)`

Find first element in a list that satisfies specified condition.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`condition` - Condition for getting the element

`source` - Source iterable

`fallback` - Fallback used if no value matches

**Since**
0.4

