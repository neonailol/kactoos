[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`MapOf(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>)`

### Parameters

`list` - List of entries`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>)`

### Parameters

`src` - The map to extend

`list` - List of entries

**Since**
0.12

`MapOf(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, X>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list

**Since**
0.11

`MapOf(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, X>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, Y>, src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`src` - The map to extend

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list

**Since**
0.12

`MapOf(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list

**Since**
0.11

`MapOf(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>, src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`src` - The map to extend

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list

**Since**
0.11

`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>)`

### Parameters

`src` - Map to extend

`list` - List of the entries

**Since**
0.12

`MapOf(entries: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>)`

### Parameters

`entries` - List of the entries`MapOf(entries: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>)`

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
0.4

