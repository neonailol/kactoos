[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [AsyncFunc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`

### Parameters

`proc` - The proc

`fct` - Factory`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`

### Parameters

`fnc` - The func

`fct` - Factory`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, threadFactory: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)``AsyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`

Func that runs in the background.

If you want your piece of code to be executed in the background, use [AsyncFunc](index.md) as following:

```
int length = new AsyncFunc(
  input -> input.length()
).invoke("Hello, world!").get();
```

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - The func

`executor` - Executor Service

**Since**
0.10

