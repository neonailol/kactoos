---
title: nnl.rocks.kactoos.map - kactoos-jvm
---

[kactoos-jvm](../index.html) / [nnl.rocks.kactoos.map](./index.html)

## Package nnl.rocks.kactoos.map

Maps.

### Types

| [MapEntry](-map-entry/index.html) | `class MapEntry<out K, out V> : `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`K`](-map-entry/index.html#K)`, `[`V`](-map-entry/index.html#V)`>`<br>MapEntry as [kotlin.collections.Map.Entry](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html). |
| [MapEnvelope](-map-envelope/index.html) | `open class MapEnvelope<X, out Y> : `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](-map-envelope/index.html#X)`, `[`Y`](-map-envelope/index.html#Y)`>`<br>Map envelope. |
| [MapNoNulls](-map-no-nulls/index.html) | `class MapNoNulls<K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableMap`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html)`<`[`K`](-map-no-nulls/index.html#K)`, `[`V`](-map-no-nulls/index.html#V)`>`<br>A decorator of [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that tolerates no NULLs. |
| [MapOf](-map-of/index.html) | `class MapOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](-map-envelope/index.html)`<`[`X`](-map-of/index.html#X)`, `[`Y`](-map-of/index.html#Y)`>`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [SolidMap](-solid-map/index.html) | `class SolidMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](-map-envelope/index.html)`<`[`X`](-solid-map/index.html#X)`, `[`Y`](-solid-map/index.html#Y)`>`<br>A [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that is both synchronized and sticky. |
| [StickyMap](-sticky-map/index.html) | `class StickyMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](-map-envelope/index.html)`<`[`X`](-sticky-map/index.html#X)`, `[`Y`](-sticky-map/index.html#Y)`>`<br>Read-only [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) decorator that goes through the map only once. |
| [SyncMap](-sync-map/index.html) | `class SyncMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](-map-envelope/index.html)`<`[`X`](-sync-map/index.html#X)`, `[`Y`](-sync-map/index.html#Y)`>`<br>Map decorator that goes through the map only once. |

