---
title: RepeatedFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [RepeatedFunc](./index.html)

# RepeatedFunc

`class RepeatedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/RepeatedFunc.kt#L17)

Func that repeats its calculation a few times before returning the last result.
If [times](#) is equal or less than zero [RepeatedFunc.apply](apply.html) will return an exception.

### Parameters

`func` - Func original

`times` - How many times.

`X` - Type of input

`Y` - Type of output

**Since**
0.6

### Constructors

| [&lt;init&gt;](-init-.html) | `RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``RepeatedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, times: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Func that repeats its calculation a few times before returning the last result. If [times](-init-.html#nnl.rocks.kactoos.func.RepeatedFunc$<init>(nnl.rocks.kactoos.Func((nnl.rocks.kactoos.func.RepeatedFunc.X, nnl.rocks.kactoos.func.RepeatedFunc.Y)), kotlin.Int)/times) is equal or less than zero [RepeatedFunc.apply](apply.html) will return an exception. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

