---
title: Limited - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [Limited](./index.html)

# Limited

`class Limited<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/Limited.kt#L19)

Limited origin.

This is a decorator over an existing origin. Returns elements of the
original origin, until either the requested number of items have been
returned or the underlying origin has been exhausted.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.6

### Constructors

| [&lt;init&gt;](-init-.html) | `Limited(restrict: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, origin: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`<br>Limited origin. |

### Functions

| [hasNext](has-next.html) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.html) | `fun next(): `[`T`](index.html#T) |

