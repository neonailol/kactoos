[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [AsyncFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y, fct: ThreadFactory)`

### Parameters

`proc` - The proc

`fct` - Factory`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, fct: ThreadFactory)`

### Parameters

`fnc` - The func

`fct` - Factory`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, executor: ExecutorService)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`
`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, threadFactory: ThreadFactory)``AsyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, executor: ExecutorService)`

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

