[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [SolidMap](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`SolidMap(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>)`

### Parameters

`list` - List of entries`SolidMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>)`

### Parameters

`map` - The map to extend

`list` - List of entries`SolidMap(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, X>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, Y>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`map` - The map to extend

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list`SolidMap(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, X>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list`SolidMap(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>, vararg list: Z)`
`SolidMap(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list`SolidMap(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Z, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Z>)`

### Parameters

`map` - The map to extend

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list`SolidMap(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>)`
`SolidMap(list: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>)`

### Parameters

`list` - Entries for the entries`SolidMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<X, Y>>)`

### Parameters

`map` - Pre-existing map we want to extend

`list` - Entries for the entries`SolidMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<X, Y>)`

A [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that is both synchronized and sticky.

Objects of this class are thread-safe.

### Parameters

`X` - Type of key

`Y` - Type of value

**Since**
0.24

