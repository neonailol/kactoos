---
title: RunnableOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [RunnableOf](./index.html)

# RunnableOf

`class RunnableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/RunnableOf.kt#L19)

Func as Runnable.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.12

### Constructors

| [&lt;init&gt;](-init-.html) | `RunnableOf(proc: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.html#X)`>, input: `[`X`](index.html#X)`)`<br>`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, input: `[`X`](index.html#X)`)`<br>`RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`X`](index.html#X)`>)`<br>`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>`RunnableOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.html#X)`>)``RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`X`](index.html#X)`>, input: `[`X`](index.html#X)`)`<br>Func as Runnable. |

### Functions

| [run](run.html) | `fun run(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

