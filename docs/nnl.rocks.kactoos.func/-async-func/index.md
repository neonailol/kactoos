---
title: AsyncFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [AsyncFunc](./index.html)

# AsyncFunc

`class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](index.html#Y)`>>, `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/AsyncFunc.kt#L29)

Func that runs in the background.

If you want your piece of code to be executed in the background, use [AsyncFunc](./index.md) as following:

```
int length = new AsyncFunc(
  input -> input.length()
).invoke("Hello, world!").get();
```

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - The func

`executor` - Executor Service

**Since**
0.10

### Constructors

| [&lt;init&gt;](-init-.html) | `AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`<br>`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`<br>`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`<br>`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, threadFactory: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)``AsyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`<br>Func that runs in the background. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](index.html#Y)`>`<br>Apply it. |
| [exec](exec.html) | `fun exec(input: `[`X`](index.html#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

