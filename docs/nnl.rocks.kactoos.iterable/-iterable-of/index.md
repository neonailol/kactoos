[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [IterableOf](./index.md)

# IterableOf

`class IterableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`X`](index.md#X)`>`

Array as iterable.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IterableOf(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>>)`<br>`IterableOf(vararg items: `[`X`](index.md#X)`)`<br>`IterableOf(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`X`](index.md#X)`>)`<br>`IterableOf(set: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`X`](index.md#X)`>)`<br>`IterableOf(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)` |
