---
title: AsyncFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [AsyncFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`

### Parameters

`proc` - The proc

`fct` - Factory`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`

### Parameters

`fnc` - The func

`fct` - Factory`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, threadFactory: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)``AsyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`

Func that runs in the background.

If you want your piece of code to be executed in the background, use [AsyncFunc](index.html) as following:

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

