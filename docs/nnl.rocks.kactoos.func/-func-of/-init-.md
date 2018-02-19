[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`FuncOf(result: `[`Y`](index.md#Y)`)`

### Parameters

`result` - The result`FuncOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`Y`](index.md#Y)`>)`

### Parameters

`callable` - The callable`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`)`

### Parameters

`proc` - The proc

`result` - Result to return`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>)`

### Parameters

`proc` - The proc

### Exceptions

`NullPointerException` - if you try to use result of [apply](apply.md)`FuncOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)`

### Parameters

`runnable` - The runnable

### Exceptions

`NullPointerException` - if you try to use result of [apply](apply.md)`FuncOf(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`

Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - Func

**Since**
0.12

