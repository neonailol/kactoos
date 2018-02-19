---
title: Shuffled.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.list](../index.html) / [Shuffled](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Shuffled(vararg src: `[`T`](index.html#T)`)`
`Shuffled(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`
`Shuffled(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`

### Parameters

`src` - The underlying collection`Shuffled(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.html#T)`>)`

Shuffled list.

Pay attention that shuffling will happen on each operation
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
0.23

