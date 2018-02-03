[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CallableOf](./index.md)

# CallableOf

`class CallableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`T`](index.md#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/CallableOf.kt#L26)

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`, input: `[`X`](index.md#X)`, result: `[`T`](index.md#T)`)`<br>`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, input: `[`X`](index.md#X)`, result: `[`T`](index.md#T)`)`<br>`CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`>)`<br>`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>)`<br>`CallableOf(runnable: `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html)`)``CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`>, input: `[`X`](index.md#X)`)`<br>Func as [Callable](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html). |

### Functions

| Name | Summary |
|---|---|
| [call](call.md) | `fun call(): `[`T`](index.md#T) |
