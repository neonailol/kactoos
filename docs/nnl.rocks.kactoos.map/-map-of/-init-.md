---
title: MapOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [MapOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`MapOf(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

### Parameters

`list` - List of entries`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

### Parameters

`src` - The map to extend

`list` - List of entries

**Since**
0.12

`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`

### Parameters

`src` - Map to extend

`list` - List of the entries

**Since**
0.12

`MapOf(entries: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`

### Parameters

`entries` - List of the entries`MapOf(entries: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`

Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) on each
method call. It doesn't cache the data anyhow.
If you don't need this [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) to re-fresh its content on every call,
by doing round-trips to the encapsulated iterable, use
[StickyMap](../-sticky-map/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of key

`Y` - Type of value

**See Also**

[StickyMap](../-sticky-map/index.html)

**Since**
0.3

