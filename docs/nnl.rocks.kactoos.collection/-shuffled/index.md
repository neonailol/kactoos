[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Shuffled](./index.md)

# Shuffled

`class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Shuffled collection.

Pay attention that shuffling will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire collection from the encapsulated object and shuffle it. If you
want to avoid that behaviour, decorate it with [StickyCollection](../-sticky-collection/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Shuffled(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`Shuffled(vararg src: `[`T`](index.md#T)`)`<br>`Shuffled(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)` |
