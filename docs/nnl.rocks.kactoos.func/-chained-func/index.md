[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [ChainedFunc](./index.md)

# ChainedFunc

`class ChainedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Z`](index.md#Z)`>`

Composed function.

### Parameters

`before` - Before function

`functions` - Functions

`after` - After function

`X` - Type of input.

`Y` - Intermediate type.

`Z` - Type of output.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ChainedFunc(before: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, after: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)``ChainedFunc(before: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, functions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Y`](index.md#Y)`, `[`Y`](index.md#Y)`>>, after: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`<br>Composed function. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Z`](index.md#Z)<br>Apply it. |
