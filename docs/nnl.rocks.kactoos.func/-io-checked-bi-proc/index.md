---
title: IoCheckedBiProc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [IoCheckedBiProc](./index.html)

# IoCheckedBiProc

`class IoCheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/IoCheckedBiProc.kt#L18)

BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

`Y` - Type of input

**Since**
0.22

### Constructors

| [&lt;init&gt;](-init-.html) | `IoCheckedBiProc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |

### Functions

| [exec](exec.html) | `fun exec(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

