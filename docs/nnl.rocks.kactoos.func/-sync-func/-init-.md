[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SyncFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`
`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`
`SyncFunc(runnable: Runnable)``SyncFunc(runnable: Runnable, result: Y)`

### Parameters

`runnable` - Func original

**Since**
0.12

`SyncFunc(callable: Callable<Y>)`

### Parameters

`callable` - Func original

**Since**
0.12

`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y)`

### Parameters

`proc` - Func original

**Since**
0.12

`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`

Func that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.4

