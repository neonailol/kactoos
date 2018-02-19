---
title: SyncMap.invoke - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.map](../index.html) / [SyncMap](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`X`](invoke.html#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Y`](invoke.html#Y)`>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`SyncMap`](index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/SyncMap.kt#L78)

### Parameters

`map` - The map to extend

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>, key: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`X`](invoke.html#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Y`](invoke.html#Y)`>): `[`SyncMap`](index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/SyncMap.kt#L97)

### Parameters

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list`@SafeVarargs operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, vararg args: `[`Z`](invoke.html#Z)`): `[`SyncMap`](index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/SyncMap.kt#L115)
`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`SyncMap`](index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/SyncMap.kt#L127)

### Parameters

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Z`](invoke.html#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.html#Z)`>): `[`SyncMap`](index.html)`<`[`X`](invoke.html#X)`, `[`Y`](invoke.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/map/SyncMap.kt#L140)

### Parameters

`map` - The map to extend

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list