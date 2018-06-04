[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`MapOf(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`

### Parameters

`list` - List of entries`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`

### Parameters

`src` - The map to extend

`list` - List of entries

**Since**
0.4

`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`

### Parameters

`src` - Map to extend

`list` - List of the entries

**Since**
0.4

`MapOf(entries: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`

### Parameters

`entries` - List of the entries`MapOf(entries: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`

Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) on each
method call. It doesn't cache the data anyhow.
If you don't need this [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) to re-fresh its content on every call,
by doing round-trips to the encapsulated iterable, use
[StickyMap](../-sticky-map/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of key

`Y` - Type of value

**See Also**

[StickyMap](../-sticky-map/index.md)

**Since**
0.3

