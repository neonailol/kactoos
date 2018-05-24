[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Folded](./index.md)

# Folded

`class Folded<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`X`](index.md#X)`>`

Iterable, which elements are "folded" through the func.

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
| [&lt;init&gt;](-init-.md) | `Folded(input: `[`X`](index.md#X)`, func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`, `[`X`](index.md#X)`>, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)``Folded(input: `[`X`](index.md#X)`, func: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`, `[`X`](index.md#X)`>, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Iterable, which elements are "folded" through the func. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`X`](index.md#X) |
