---
title: SyncFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [SyncFunc](./index.html)

# SyncFunc

`class SyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/SyncFunc.kt#L16)

Func that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.4

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>`SyncFunc(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)`<br>`SyncFunc(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, result: `[`Y`](index.html#Y)`)`<br>`SyncFunc(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Y`](index.html#Y)`>)`<br>`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`)``SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Func that is thread-safe. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

