[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Sorted](./index.md)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.md#T)`>> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`T`](index.md#T)`>`

Sorted list.

Pay attention that sorting will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire list from the encapsulated object and sort it. If you
want to avoid that "side-effect", decorate it with [StickyList](../-sticky-list/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**See Also**

[StickyList](../-sticky-list/index.md)

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(vararg src: `[`T`](index.md#T)`)`<br>`Sorted(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(cmp: `[`Comparator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparator/index.html)`<`[`T`](index.md#T)`>, vararg src: `[`T`](index.md#T)`)` |
