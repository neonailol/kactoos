[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [BiFuncOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`BiFuncOf(fnc: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`
`BiFuncOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Z`](index.md#Z)`>)`

### Parameters

`fnc` - The func`BiFuncOf(result: `[`Z`](index.md#Z)`)`

### Parameters

`result` - The result`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Z`](index.md#Z)`)`
`BiFuncOf(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, result: `[`Z`](index.md#Z)`)`

### Parameters

`proc` - The proc

`result` - Result to return`BiFuncOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Z`](index.md#Z)`>)`

### Parameters

`callable` - The callable`BiFuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.md#X)`, result: `[`Z`](index.md#Z)`)`

### Parameters

`runnable` - The runnable`BiFuncOf(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`

Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`func` - Func

**Since**
0.20

