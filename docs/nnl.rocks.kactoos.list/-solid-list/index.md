---
title: SolidList - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.list](../index.html) / [SolidList](./index.html)

# SolidList

`class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/SolidList.kt#L19)

A [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) that is both synchronized and sticky.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.24

### Constructors

| [&lt;init&gt;](-init-.html) | `SolidList(vararg items: `[`X`](index.html#X)`)`<br>`SolidList(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`<br>`SolidList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)``SolidList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>)`<br>A [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) that is both synchronized and sticky. |

