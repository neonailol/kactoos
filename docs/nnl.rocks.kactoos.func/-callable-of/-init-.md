[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CallableOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`CallableOf(runnable: Runnable, input: X, result: T)`

### Parameters

`runnable` - Encapsulated runnable

**Since**
0.12

`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, input: X, result: T)`

### Parameters

`proc` - Encapsulated proc

**Since**
0.12

`CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>)`
`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`
`CallableOf(runnable: Runnable)``CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>, input: X)`

Func as [Callable](#).

You may want to use this decorator where
[Callable](#) is required, but you just have a function:

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

