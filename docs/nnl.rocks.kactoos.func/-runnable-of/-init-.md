[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RunnableOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`RunnableOf(proc: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.md#X)`>, input: `[`X`](index.md#X)`)`

### Parameters

`proc` - Encapsulated proc

**Since**
0.11

`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, input: `[`X`](index.md#X)`)`

### Parameters

`proc` - Encapsulated proc`RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`X`](index.md#X)`>)`
`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>)`
`RunnableOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.md#X)`>)``RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`X`](index.md#X)`>, input: `[`X`](index.md#X)`)`

Func as Runnable.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.12

