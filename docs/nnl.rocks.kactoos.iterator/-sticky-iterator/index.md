---
title: StickyIterator - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [StickyIterator](./index.html)

# StickyIterator

`class StickyIterator<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/StickyIterator.kt#L20)

Iterator that returns the same set of elements always.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.8

### Constructors

| [&lt;init&gt;](-init-.html) | `StickyIterator(vararg items: `[`X`](index.html#X)`)``StickyIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`<br>Iterator that returns the same set of elements always. |

### Functions

| [hasNext](has-next.html) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.html) | `fun next(): `[`X`](index.html#X) |

