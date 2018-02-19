---
title: Sorted - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterable](../index.html) / [Sorted](./index.html)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.html#T)`>> : `[`IterableEnvelope`](../-iterable-envelope/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/Sorted.kt#L15)

Sorted iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.7

### Constructors

| [&lt;init&gt;](-init-.html) | `Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`<br>`Sorted(vararg src: `[`T`](index.html#T)`)``Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime.`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, vararg args: `[`T`](index.html#T)`)`<br>Ctor. |

