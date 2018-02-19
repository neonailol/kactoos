---
title: SyncMap.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [SyncMap](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`SyncMap(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

### Parameters

`list` - List of entries`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

### Parameters

`map` - The map to extend

`list` - List of entries`SyncMap(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`
`SyncMap(list: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`

### Parameters

`list` - Entries for the entries`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`

Ctor.

### Parameters

`map` - Pre-existing map we want to extend

`list` - Entries for the entries`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

Map decorator that goes through the map only once.

The map is read-only.

Objects of this class are thread-safe.

### Parameters

`X` - Type of key

`Y` - Type of value

**Since**
0.24

