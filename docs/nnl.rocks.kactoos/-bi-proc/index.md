---
title: BiProc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos](../index.html) / [BiProc](./index.html)

# BiProc

`expect interface BiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Proc that accepts two arguments.

**Since**
0.2

### Functions

| [exec](exec.html) | `abstract fun exec(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

### Inheritors

| [BiProcOf](../../nnl.rocks.kactoos.func/-bi-proc-of/index.html) | `class BiProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-bi-proc-of/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-bi-proc-of/index.html#Y)`>`<br>Func as BiProc. |
| [IoCheckedBiProc](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.html) | `class IoCheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.html#Y)`>`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [UncheckedBiProc](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.html) | `class UncheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.html#Y)`>`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

