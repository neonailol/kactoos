---
title: StickyList - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.list](../index.html) / [StickyList](./index.html)

# StickyList

`class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/StickyList.kt#L23)

List decorator that goes through the list only once.

The list is read only.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.8

### Constructors

| [&lt;init&gt;](-init-.html) | `StickyList(vararg items: `[`X`](index.html#X)`)`<br>`StickyList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>`StickyList(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)``StickyList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>)`<br>List decorator that goes through the list only once. |

