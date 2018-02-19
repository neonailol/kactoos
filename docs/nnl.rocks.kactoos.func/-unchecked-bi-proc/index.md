---
title: UncheckedBiProc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [UncheckedBiProc](./index.html)

# UncheckedBiProc

`class UncheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/UncheckedBiProc.kt#L17)

BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

**Since**
0.22

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedBiProc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [exec](exec.html) | `fun exec(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

