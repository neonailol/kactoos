[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Joined](./index.md)

# Joined

`class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`X`](index.md#X)`>`

Joined list.

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Joined(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`X`](index.md#X)`>>)`<br>`Joined(vararg lists: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`X`](index.md#X)`>)`<br>`Joined(first: `[`X`](index.md#X)`, vararg lists: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`X`](index.md#X)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-list-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-list-envelope/index.md#T)`>` |
| [listIterator](../-list-envelope/list-iterator.md) | `open fun listIterator(): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>`<br>`open fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>` |
