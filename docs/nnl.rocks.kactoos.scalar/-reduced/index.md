[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Reduced](./index.md)

# Reduced

`class Reduced<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`X`](index.md#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/Reduced.kt#L18)

Iterable, which elements are "reduced" through the func.

### Parameters

`T` - Type of element

`X` - Type of input and output

`input` - Input

`func` - Func original

`iterable` - List of items

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Reduced(input: `[`X`](index.md#X)`, func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`, `[`X`](index.md#X)`>, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Iterable, which elements are "reduced" through the func. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): `[`X`](index.md#X)<br>Convert it to the value. |
