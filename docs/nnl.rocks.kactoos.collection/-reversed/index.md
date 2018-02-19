---
title: Reversed - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.collection](../index.html) / [Reversed](./index.html)

# Reversed

`class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/Reversed.kt#L22)

Reversed collection.

Pay attention that sorting will happen on each operation
with the collection. Every time you touch it, it will fetch the
entire collection from the encapsulated object and reverse it. If you
want to avoid that "side-effect", decorate it with
[StickyCollection](../-sticky-collection/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

**Since**
1.16

### Constructors

| [&lt;init&gt;](-init-.html) | `Reversed(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>)`<br>`Reversed(vararg src: `[`X`](index.html#X)`)`<br>`Reversed(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)` |

