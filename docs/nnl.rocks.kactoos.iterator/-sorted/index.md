---
title: Sorted - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [Sorted](./index.html)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.html#T)`>> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/Sorted.kt#L20)

Sorted iterator.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.7

### Constructors

| [&lt;init&gt;](-init-.html) | `Sorted(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime.`Sorted(comparator: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`<br>Sorted iterator. |

### Functions

| [hasNext](has-next.html) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.html) | `fun next(): `[`T`](index.html#T) |

