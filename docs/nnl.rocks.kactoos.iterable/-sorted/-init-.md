---
title: Sorted.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterable](../index.html) / [Sorted](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)``Sorted(vararg src: `[`T`](index.html#T)`)`

### Parameters

`src` - The underlying iterable`Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`

If you're using this ctor you must be sure that type `T`
implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be
a type casting exception in runtime.

### Parameters

`src` - The underlying iterable`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.html#T)`>, vararg args: `[`T`](index.html#T)`)`

Ctor.

### Parameters

`args` - The underlying iterable

`cmp` - The comparator