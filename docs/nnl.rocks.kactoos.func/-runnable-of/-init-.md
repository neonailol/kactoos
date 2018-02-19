---
title: RunnableOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [RunnableOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`RunnableOf(proc: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.html#X)`>, input: `[`X`](index.html#X)`)`

### Parameters

`proc` - Encapsulated proc

**Since**
0.11

`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, input: `[`X`](index.html#X)`)`

### Parameters

`proc` - Encapsulated proc`RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`X`](index.html#X)`>)`
`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`
`RunnableOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.html#X)`>)``RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`X`](index.html#X)`>, input: `[`X`](index.html#X)`)`

Func as Runnable.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.12

