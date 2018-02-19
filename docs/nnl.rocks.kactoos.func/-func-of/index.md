---
title: FuncOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [FuncOf](./index.html)

# FuncOf

`class FuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/FuncOf.kt#L19)

Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - Func

**Since**
0.12

### Constructors

| [&lt;init&gt;](-init-.html) | `FuncOf(result: `[`Y`](index.html#Y)`)`<br>`FuncOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Y`](index.html#Y)`>)`<br>`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`)`<br>`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>`FuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)``FuncOf(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.html). |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

