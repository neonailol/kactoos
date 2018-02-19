---
title: MapEnvelope - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [MapEnvelope](./index.html)

# MapEnvelope

`open class MapEnvelope<X, out Y> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/MapEnvelope.kt#L19)

Map envelope.

There is no thread-safety guarantee.

### Parameters

`X` - Type of key

`Y` - Type of value

**See Also**

[StickyMap](../-sticky-map/index.html)

**Since**
0.24

### Constructors

| [&lt;init&gt;](-init-.html) | `MapEnvelope(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)``MapEnvelope(map: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`<br>Map envelope. |

### Inheritors

| [MapOf](../-map-of/index.html) | `class MapOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-map-of/index.html#X)`, `[`Y`](../-map-of/index.html#Y)`>`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [SolidMap](../-solid-map/index.html) | `class SolidMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-solid-map/index.html#X)`, `[`Y`](../-solid-map/index.html#Y)`>`<br>A [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that is both synchronized and sticky. |
| [StickyMap](../-sticky-map/index.html) | `class StickyMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-sticky-map/index.html#X)`, `[`Y`](../-sticky-map/index.html#Y)`>`<br>Read-only [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) decorator that goes through the map only once. |
| [SyncMap](../-sync-map/index.html) | `class SyncMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](./index.md)`<`[`X`](../-sync-map/index.html#X)`, `[`Y`](../-sync-map/index.html#Y)`>`<br>Map decorator that goes through the map only once. |

