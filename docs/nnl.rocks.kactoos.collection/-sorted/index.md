[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Sorted](./index.md)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.md#T)`>> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Sorted collection.

Pay attention that sorting will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire collection from the encapsulated object and sort it. If you
want to avoid that "side-effect", decorate it with
[StickyCollection](../-sticky-collection/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.19

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(vararg src: `[`T`](index.md#T)`)`<br>`Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, vararg src: `[`T`](index.md#T)`)`<br>`Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)``Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime. |
