[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapEnvelope](./index.md)

# MapEnvelope

`open class MapEnvelope<X, out Y> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/MapEnvelope.kt#L19)

Map envelope.

There is no thread-safety guarantee.

### Parameters

`X` - Type of key

`Y` - Type of value

**See Also**

[StickyMap](../-sticky-map/index.md)

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MapEnvelope(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)``MapEnvelope(map: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`<br>Map envelope. |

### Inheritors

| Name | Summary |
|---|---|
| [MapOf](../-map-of/index.md) | `class MapOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-map-of/index.md#X)`, `[`Y`](../-map-of/index.md#Y)`>`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [SolidMap](../-solid-map/index.md) | `class SolidMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-solid-map/index.md#X)`, `[`Y`](../-solid-map/index.md#Y)`>`<br>A [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that is both synchronized and sticky. |
| [StickyMap](../-sticky-map/index.md) | `class StickyMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-sticky-map/index.md#X)`, `[`Y`](../-sticky-map/index.md#Y)`>`<br>Read-only [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) decorator that goes through the map only once. |
| [SyncMap](../-sync-map/index.md) | `class SyncMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-sync-map/index.md#X)`, `[`Y`](../-sync-map/index.md#Y)`>`<br>Map decorator that goes through the map only once. |
