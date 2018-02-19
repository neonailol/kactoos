---
title: BiProcOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [BiProcOf](./index.html)

# BiProcOf

`class BiProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/BiProcOf.kt#L16)

Func as BiProc.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`proc` - The proc

**Since**
0.12

### Constructors

| [&lt;init&gt;](-init-.html) | `BiProcOf(proc: `[`KBiProc`](../../nnl.rocks.kactoos/-k-bi-proc.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>Func as BiProc. |

### Functions

| [exec](exec.html) | `fun exec(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

