[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [AndWithIndex](index.md) / [invoke](./invoke.md)

# invoke

`fun invoke(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`@SafeVarargs operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, vararg src: `[`X`](invoke.md#X)`): `[`AndWithIndex`](index.md)

### Parameters

`proc` - Proc to map

`src` - The iterable

`X` - Type of items in the iterable`@SafeVarargs operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](invoke.md#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](invoke.md#X)`): `[`AndWithIndex`](index.md)

### Parameters

`func` - Func to map

`src` - The iterable

`X` - Type of items in the iterable`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](invoke.md#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](invoke.md#X)`>): `[`AndWithIndex`](index.md)

### Parameters

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable

**Since**
0.24

`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](invoke.md#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](invoke.md#X)`>): `[`AndWithIndex`](index.md)

### Parameters

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable

**Since**
0.24

