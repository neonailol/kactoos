[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapEntry](.)

# MapEntry

`class MapEntry<out K, out V> : `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<K, V>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/MapEntry.kt#L16)

MapEntry as [kotlin.collections.Map.Entry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html).

There is no thread-safety guarantee.

### Parameters

`K` - Key type

`V` - Value type

`src` - The key of the entry's map.

`trgt` - The value associated to the key of the entry's map.

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MapEntry(src: K, trgt: V)`<br>MapEntry as [kotlin.collections.Map.Entry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html). |

### Properties

| Name | Summary |
|---|---|
| [key](key.md) | `val key: K` |
| [value](value.md) | `val value: V` |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
