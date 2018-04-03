[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [AsyncFunc](./index.md)

# AsyncFunc

`class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](index.md#Y)`>>, `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>`

Func that runs in the background.

If you want your piece of code to be executed in the background, use [AsyncFunc](./index.md) as following:

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`<br>`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, fct: `[`ThreadFactory`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ThreadFactory.html)`)`<br>`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)``AsyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, executor: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`)`<br>Func that runs in the background. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](index.md#Y)`>`<br>Apply it. |
| [exec](exec.md) | `fun exec(input: `[`X`](index.md#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
