---
title: CallableOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [CallableOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.html#X)`, result: `[`T`](index.html#T)`)`

### Parameters

`runnable` - Encapsulated runnable

**Since**
0.12

`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, input: `[`X`](index.html#X)`, result: `[`T`](index.html#T)`)`

### Parameters

`proc` - Encapsulated proc

**Since**
0.12

`CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`T`](index.html#T)`>)`
`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`
`CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)``CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`T`](index.html#T)`>, input: `[`X`](index.html#X)`)`

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

