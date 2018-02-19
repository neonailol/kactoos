---
title: CallableOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [CallableOf](./index.html)

# CallableOf

`class CallableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/CallableOf.kt#L26)

Func as [Callable](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html).

You may want to use this decorator where
[Callable](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html) is required, but you just have a function:

```
Callable<String> callable = new CallableOf<>(i -> "Hello, world!");
```

There is no thread-safety guarantee.

### Parameters

`func` - Encapsulated func

`input` - Input

`X` - Type of input

`T` - Type of output

**Since**
0.12

### Constructors

| [&lt;init&gt;](-init-.html) | `CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.html#X)`, result: `[`T`](index.html#T)`)`<br>`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, input: `[`X`](index.html#X)`, result: `[`T`](index.html#T)`)`<br>`CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`T`](index.html#T)`>)`<br>`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>`CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)``CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`T`](index.html#T)`>, input: `[`X`](index.html#X)`)`<br>Func as [Callable](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html). |

### Functions

| [call](call.html) | `fun call(): `[`T`](index.html#T) |

