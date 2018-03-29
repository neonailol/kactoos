[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [SyncMap](./index.md)

# SyncMap

`class SyncMap<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](../-map-envelope/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Map decorator that goes through the map only once.

The map is read-only.

Objects of this class are thread-safe.

### Parameters

`X` - Type of key

`Y` - Type of value

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncMap(vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, vararg list: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>`SyncMap(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`<br>`SyncMap(list: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)``SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>>)`<br>Ctor.`SyncMap(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>Map decorator that goes through the map only once. |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`X`](invoke.md#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Y`](invoke.md#Y)`>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>, key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`X`](invoke.md#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Y`](invoke.md#Y)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>>, vararg args: `[`Z`](invoke.md#Z)`): `[`SyncMap`](./index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>): `[`SyncMap`](./index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>` |
