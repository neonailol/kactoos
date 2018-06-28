[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Reversed](./index.md)

# Reversed

`class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`X`](index.md#X)`>`

Reversed collection.

Pay attention that sorting will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire collection from the encapsulated object and reverse it. If you
want to avoid that behaviour, decorate it with [StickyCollection](../-sticky-collection/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Reversed(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`<br>`Reversed(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>`Reversed(vararg src: `[`X`](index.md#X)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
