---
title: ProcOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [ProcOf](./index.html)

# ProcOf

`class ProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/ProcOf.kt#L17)

Func as Proc.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`proc` - The proc

**Since**
0.12

### Constructors

| [&lt;init&gt;](-init-.html) | `ProcOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)`<br>`ProcOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.html#X)`>)`<br>`ProcOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, *>)`<br>`ProcOf(proc: `[`KProc`](../../nnl.rocks.kactoos/-k-proc.html)`<`[`X`](index.html#X)`>)``ProcOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>Func as Proc. |

