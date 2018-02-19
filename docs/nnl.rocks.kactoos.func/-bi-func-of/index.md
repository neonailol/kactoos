---
title: BiFuncOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [BiFuncOf](./index.html)

# BiFuncOf

`class BiFuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/BiFuncOf.kt#L21)

Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`func` - Func

**Since**
0.20

### Constructors

| [&lt;init&gt;](-init-.html) | `BiFuncOf(fnc: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`<br>`BiFuncOf(result: `[`Z`](index.html#Z)`)`<br>`BiFuncOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Z`](index.html#Z)`>)`<br>`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Z`](index.html#Z)`)`<br>`BiFuncOf(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, result: `[`Z`](index.html#Z)`)`<br>`BiFuncOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Z`](index.html#Z)`>)`<br>`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>`BiFuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)`<br>`BiFuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.html#X)`, result: `[`Z`](index.html#Z)`)``BiFuncOf(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`<br>Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.html). |

### Functions

| [apply](apply.html) | `fun apply(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Z`](index.html#Z)<br>Apply it. |

