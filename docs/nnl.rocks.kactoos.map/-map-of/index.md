---
title: MapOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [MapOf](./index.html)

# MapOf

`class MapOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](../-map-envelope/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/MapOf.kt#L30)

Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) on each
method call. It doesn't cache the data anyhow.
If you don't need this [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) to re-fresh its content on every call,
by doing round-trips to the encapsulated iterable, use
[StickyMap](../-sticky-map/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of key

`Y` - Type of value

**See Also**

[StickyMap](../-sticky-map/index.html)

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `MapOf(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>`MapOf(src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`<br>`MapOf(entries: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)``MapOf(entries: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`X`](invoke.html#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`MapOf`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`X`](invoke.html#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Y`](invoke.html#Y)`>, src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`MapOf`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`MapOf`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, src: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`MapOf`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` |

