[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [IterableOf](./index.md)

# IterableOf

`class IterableOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Array as iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Type of item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IterableOf(scalar: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>>)`<br>`IterableOf(vararg items: `[`T`](index.md#T)`)`<br>`IterableOf(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>>)`<br>`IterableOf(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>)`<br>`IterableOf(set: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`T`](index.md#T)`>)`<br>`IterableOf(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
