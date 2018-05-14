[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapEnvelope](./index.md)

# MapEnvelope

`open class MapEnvelope<X, out Y> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Map envelope.

There is no thread-safety guarantee.

### Parameters

`X` - Type of key

`Y` - Type of value

**See Also**

[StickyMap](../-sticky-map/index.md)

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MapEnvelope(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)``MapEnvelope(map: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`<br>Map envelope. |

### Inheritors

| Name | Summary |
|---|---|
| [Grouped](../-grouped/index.md) | `class Grouped<K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`K`](../-grouped/index.md#K)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`V`](../-grouped/index.md#V)`>>`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [MapOf](../-map-of/index.md) | `class MapOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-map-of/index.md#X)`, `[`Y`](../-map-of/index.md#Y)`>`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [SolidMap](../-solid-map/index.md) | `class SolidMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-solid-map/index.md#X)`, `[`Y`](../-solid-map/index.md#Y)`>`<br>A [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that is both synchronized and sticky. |
| [StickyMap](../-sticky-map/index.md) | `class StickyMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-sticky-map/index.md#X)`, `[`Y`](../-sticky-map/index.md#Y)`>`<br>Read-only [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) decorator that goes through the map only once. |
| [SyncMap](../-sync-map/index.md) | `class SyncMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-sync-map/index.md#X)`, `[`Y`](../-sync-map/index.md#Y)`>`<br>Map decorator that goes through the map only once. |
