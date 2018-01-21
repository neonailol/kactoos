[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`FuncOf(result: Y)`

### Parameters

`result` - The result`FuncOf(callable: Callable<Y>)`

### Parameters

`callable` - The callable`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y)`

### Parameters

`proc` - The proc

`result` - Result to return`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`

### Parameters

`proc` - The proc

### Exceptions

`NullPointerException` - if you try to use result of [apply](apply.md)`FuncOf(runnable: Runnable)`

### Parameters

`runnable` - The runnable

### Exceptions

`NullPointerException` - if you try to use result of [apply](apply.md)`FuncOf(func: KFunc<X, Y>)`

Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - Func

**Since**
0.12

