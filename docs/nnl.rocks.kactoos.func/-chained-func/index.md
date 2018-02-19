---
title: ChainedFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [ChainedFunc](./index.html)

# ChainedFunc

`class ChainedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Z`](index.html#Z)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/ChainedFunc.kt#L16)

Composed function.

### Parameters

`before` - Before function

`functions` - Functions

`after` - After function

`X` - Type of input.

`Y` - Intermediate type.

`Z` - Type of output.

**Since**
0.7

### Constructors

| [&lt;init&gt;](-init-.html) | `ChainedFunc(bfr: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, atr: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)``ChainedFunc(before: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, functions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Y`](index.html#Y)`>>, after: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`<br>Composed function. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Z`](index.html#Z)<br>Apply it. |

