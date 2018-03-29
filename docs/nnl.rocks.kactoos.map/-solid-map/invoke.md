[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [SolidMap](index.md) / [invoke](./invoke.md)

# invoke

`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`X`](invoke.md#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Y`](invoke.md#Y)`>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>): `[`SolidMap`](index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`

### Parameters

`map` - The map to extend

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>, key: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`X`](invoke.md#X)`>, value: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Y`](invoke.md#Y)`>): `[`SolidMap`](index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`

### Parameters

`list` - List of items

`key` - Func to create key

`value` - Func to create value

`Z` - Type of items in the list`@SafeVarargs operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>>, vararg args: `[`Z`](invoke.md#Z)`): `[`SolidMap`](index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`
`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>): `[`SolidMap`](index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`

### Parameters

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(entry: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Z`](invoke.md#Z)`, `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>>, map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>, list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Z`](invoke.md#Z)`>): `[`SolidMap`](index.md)`<`[`X`](invoke.md#X)`, `[`Y`](invoke.md#Y)`>`

### Parameters

`map` - The map to extend

`list` - List of items

`entry` - Func to create entry

`Z` - Type of items in the list