[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CallableOf](.)

# CallableOf

`class CallableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Callable<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/CallableOf.kt#L26)

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CallableOf(runnable: Runnable, input: X, result: T)`<br>`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, input: X, result: T)`<br>`CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>)`<br>`CallableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`CallableOf(runnable: Runnable)``CallableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>, input: X)`<br>Func as [Callable](#). |

### Functions

| Name | Summary |
|---|---|
| [call](call.md) | `fun call(): T` |
