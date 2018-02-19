---
title: UncheckedFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [UncheckedFunc](./index.html)

# UncheckedFunc

`class UncheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/UncheckedFunc.kt#L18)

Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.2

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

