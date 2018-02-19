---
title: SyncMap - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [SyncMap](./index.html)

# SyncMap

`class SyncMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](../-map-envelope/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/SyncMap.kt#L26)

Map decorator that goes through the map only once.

The map is read-only.

Objects of this class are thread-safe.

### Parameters

`X` - Type of key

`Y` - Type of value

**Since**
0.24

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncMap(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>`SyncMap(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`<br>`SyncMap(list: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)``SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>)`<br>Ctor.`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>Map decorator that goes through the map only once. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`X`](invoke.html#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Y`](invoke.html#Y)`>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>, key: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`X`](invoke.html#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Y`](invoke.html#Y)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, vararg args: `[`Z`](invoke.html#Z)`): `[`SyncMap`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` |

