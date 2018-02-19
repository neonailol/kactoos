---
title: IterableNoNulls - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterable](../index.html) / [IterableNoNulls](./index.html)

# IterableNoNulls

`class IterableNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableIterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/IterableNoNulls.kt#L17)

A decorator for [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that doesn't allow any NULL.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.27

### Constructors

| [&lt;init&gt;](-init-.html) | `IterableNoNulls(iterable: `[`IterableEnvelope`](../-iterable-envelope/index.html)`<`[`X`](index.html#X)`>)``IterableNoNulls(origin: `[`MutableIterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>A decorator for [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that doesn't allow any NULL. |

### Functions

| [iterator](iterator.html) | `fun iterator(): `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.html#X)`>` |

