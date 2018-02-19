---
title: CollectionNoNulls - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.collection](../index.html) / [CollectionNoNulls](./index.html)

# CollectionNoNulls

`class CollectionNoNulls<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/CollectionNoNulls.kt#L16)

A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs.

There is no thread-safety guarantee.

### Parameters

`X` - Element type

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `CollectionNoNulls(col: `[`CollectionEnvelope`](../-collection-envelope/index.html)`<`[`X`](index.html#X)`>)`<br>`CollectionNoNulls(col: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>)``CollectionNoNulls(col: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`X`](index.html#X)`>>)`<br>A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs. |

### Functions

| [iterator](iterator.html) | `fun iterator(): `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](index.html#X)`>` |

