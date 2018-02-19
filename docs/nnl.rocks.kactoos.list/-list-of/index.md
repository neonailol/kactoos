---
title: ListOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.list](../index.html) / [ListOf](./index.html)

# ListOf

`class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/ListOf.kt#L22)

Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) to re-fresh its content on every call,
by doing round-trips to the encapsulated iterable, decorate it with
[StickyList](../-sticky-list/index.html).

There is no thread-safety guarantee.

### Parameters

`T` - List type

**See Also**

[StickyList](../-sticky-list/index.html)

**Since**
0.1

### Constructors

| [&lt;init&gt;](-init-.html) | `ListOf(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`<br>`ListOf(vararg array: `[`T`](index.html#T)`)`<br>`ListOf(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)` |

