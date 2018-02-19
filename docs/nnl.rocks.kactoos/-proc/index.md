---
title: Proc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos](../index.html) / [Proc](./index.html)

# Proc

`expect interface Proc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Procedure.

### Parameters

`X` - Type of input

**Since**
0.2

### Types

| [NoNulls](-no-nulls/index.html) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](-no-nulls/index.html#X)`>` |

### Functions

| [exec](exec.html) | `abstract fun exec(input: `[`X`](index.html#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

### Inheritors

| [AsyncFunc](../../nnl.rocks.kactoos.func/-async-func/index.html) | `class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../-func/index.html)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.html#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](../../nnl.rocks.kactoos.func/-async-func/index.html#Y)`>>, `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.html#X)`>`<br>Func that runs in the background. |
| [IoCheckedProc](../../nnl.rocks.kactoos.func/-io-checked-proc/index.html) | `class IoCheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-proc/index.html#X)`>`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [java.io.IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [NoNulls](-no-nulls/index.html) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](-no-nulls/index.html#X)`>` |
| [ProcOf](../../nnl.rocks.kactoos.func/-proc-of/index.html) | `class ProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-proc-of/index.html#X)`>`<br>Func as Proc. |
| [UncheckedProc](../../nnl.rocks.kactoos.func/-unchecked-proc/index.html) | `class UncheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-proc/index.html#X)`>`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

