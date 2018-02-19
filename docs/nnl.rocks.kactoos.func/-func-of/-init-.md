---
title: FuncOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [FuncOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`FuncOf(result: `[`Y`](index.html#Y)`)`

### Parameters

`result` - The result`FuncOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Y`](index.html#Y)`>)`

### Parameters

`callable` - The callable`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`)`

### Parameters

`proc` - The proc

`result` - Result to return`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`proc` - The proc

### Exceptions

`NullPointerException` - if you try to use result of [apply](apply.html)`FuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)`

### Parameters

`runnable` - The runnable

### Exceptions

`NullPointerException` - if you try to use result of [apply](apply.html)`FuncOf(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - Func

**Since**
0.12

