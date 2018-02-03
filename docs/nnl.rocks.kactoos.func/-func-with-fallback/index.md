[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncWithFallback](./index.md)

# FuncWithFallback

`class FuncWithFallback<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/FuncWithFallback.kt#L19)

Func with a fallback plan.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - The func

`fallback` - The fallback

`follow` - The follow up func

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.md#Y)`>)``FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.md#Y)`>, follow: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Y`](index.md#Y)`, `[`Y`](index.md#Y)`>)`<br>Func with a fallback plan. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |
