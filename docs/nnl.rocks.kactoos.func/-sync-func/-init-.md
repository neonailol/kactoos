---
title: SyncFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [SyncFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`
`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`
`SyncFunc(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)``SyncFunc(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, result: `[`Y`](index.html#Y)`)`

### Parameters

`runnable` - Func original

**Since**
0.12

`SyncFunc(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Y`](index.html#Y)`>)`

### Parameters

`callable` - Func original

**Since**
0.12

`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`)`

### Parameters

`proc` - Func original

**Since**
0.12

`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`

Func that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.4

