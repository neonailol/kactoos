[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CallableOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.md#X)`, result: `[`T`](index.md#T)`)`

### Parameters

`runnable` - Encapsulated runnable

**Since**
0.12

`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, input: `[`X`](index.md#X)`, result: `[`T`](index.md#T)`)`

### Parameters

`proc` - Encapsulated proc

**Since**
0.12

`CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`>, input: `[`X`](index.md#X)`)`

Func as [Callable](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html).

You may want to use this decorator where
[Callable](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html) is required, but you just have a function:

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

