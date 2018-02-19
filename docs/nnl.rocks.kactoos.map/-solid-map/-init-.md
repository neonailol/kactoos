[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [SolidMap](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SolidMap(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`

### Parameters

`list` - List of entries`SolidMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`

### Parameters

`map` - The map to extend

`list` - List of entries`SolidMap(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`
`SolidMap(list: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`

### Parameters

`list` - Entries for the entries`SolidMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`

### Parameters

`map` - Pre-existing map we want to extend

`list` - Entries for the entries`SolidMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`

A [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that is both synchronized and sticky.

Objects of this class are thread-safe.

### Parameters

`X` - Type of key

`Y` - Type of value

**Since**
0.24

