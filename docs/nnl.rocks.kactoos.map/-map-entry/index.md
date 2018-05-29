[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapEntry](./index.md)

# MapEntry

`class MapEntry<out K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`K`](index.md#K)`, `[`V`](index.md#V)`>`

MapEntry as [kotlin.collections.Map.Entry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html).

There is no thread-safety guarantee.

### Parameters

`K` - Key type

`V` - Value type

`key` - The key of the entry's map.

`value` - The value associated to the key of the entry's map.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MapEntry(key: `[`K`](index.md#K)`, value: `[`V`](index.md#V)`)`<br>MapEntry as [kotlin.collections.Map.Entry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html). |

### Properties

| Name | Summary |
|---|---|
| [key](key.md) | `val key: `[`K`](index.md#K)<br>The key of the entry's map. |
| [value](value.md) | `val value: `[`V`](index.md#V)<br>The value associated to the key of the entry's map. |

### Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
