---
title: Sorted - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.list](../index.html) / [Sorted](./index.html)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.html#T)`>> : `[`ListEnvelope`](../-list-envelope/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/Sorted.kt#L23)

Sorted list.

Pay attention that sorting will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire list from the encapsulated object and sort it. If you
want to avoid that "side-effect", decorate it with
[StickyList](../-sticky-list/index.html).

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**See Also**

[StickyList](../-sticky-list/index.html)

**Since**
0.19

### Constructors

| [&lt;init&gt;](-init-.html) | `Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.html#T)`>)`<br>`Sorted(vararg src: `[`T`](index.html#T)`)`<br>`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, vararg src: `[`T`](index.html#T)`)``Sorted(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`<br>`Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime. |

