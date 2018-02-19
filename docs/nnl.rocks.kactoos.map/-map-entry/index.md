---
title: MapEntry - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [MapEntry](./index.html)

# MapEntry

`class MapEntry<out K, out V> : `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`K`](index.html#K)`, `[`V`](index.html#V)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/MapEntry.kt#L16)

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

| [&lt;init&gt;](-init-.html) | `MapEntry(src: `[`K`](index.html#K)`, trgt: `[`V`](index.html#V)`)`<br>MapEntry as [kotlin.collections.Map.Entry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html). |

### Properties

| [key](key.html) | `val key: `[`K`](index.html#K) |
| [value](value.html) | `val value: `[`V`](index.html#V) |

### Functions

| [equals](equals.html) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.html) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.html) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

