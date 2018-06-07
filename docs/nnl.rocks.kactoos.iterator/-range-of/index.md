[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [RangeOf](./index.md)

# RangeOf

`class RangeOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.md#T)`>> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>`

Iterator implementation to model range functionality.

### Parameters

`T` - Range value type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RangeOf(min: `[`T`](index.md#T)`, max: `[`T`](index.md#T)`, incrementor: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`>)`<br>Iterator implementation to model range functionality. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`T`](index.md#T) |
