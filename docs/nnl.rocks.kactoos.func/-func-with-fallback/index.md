---
title: FuncWithFallback - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [FuncWithFallback](./index.html)

# FuncWithFallback

`class FuncWithFallback<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/FuncWithFallback.kt#L19)

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

| [&lt;init&gt;](-init-.html) | `FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.html#Y)`>)``FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.html#Y)`>, follow: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Y`](index.html#Y)`>)`<br>Func with a fallback plan. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

