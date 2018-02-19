---
title: BiFuncOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [BiFuncOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`BiFuncOf(fnc: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`
`BiFuncOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Z`](index.html#Z)`>)`

### Parameters

`fnc` - The func`BiFuncOf(result: `[`Z`](index.html#Z)`)`

### Parameters

`result` - The result`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Z`](index.html#Z)`)`
`BiFuncOf(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, result: `[`Z`](index.html#Z)`)`

### Parameters

`proc` - The proc

`result` - Result to return`BiFuncOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Z`](index.html#Z)`>)`

### Parameters

`callable` - The callable`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`
`BiFuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)``BiFuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.html#X)`, result: `[`Z`](index.html#Z)`)`

### Parameters

`runnable` - The runnable`BiFuncOf(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`

Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`func` - Func

**Since**
0.20

