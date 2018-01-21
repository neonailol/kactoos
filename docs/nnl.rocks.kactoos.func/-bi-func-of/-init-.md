[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [BiFuncOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`BiFuncOf(fnc: KBiFunc<X, Y, Z>)`
`BiFuncOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Z>)`

### Parameters

`fnc` - The func`BiFuncOf(result: Z)`

### Parameters

`result` - The result`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Z)`
`BiFuncOf(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<X, Y>, result: Z)`

### Parameters

`proc` - The proc

`result` - Result to return`BiFuncOf(callable: Callable<Z>)`

### Parameters

`callable` - The callable`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`
`BiFuncOf(runnable: Runnable)``BiFuncOf(runnable: Runnable, input: X, result: Z)`

### Parameters

`runnable` - The runnable`BiFuncOf(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>)`

Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`func` - Func

**Since**
0.20

