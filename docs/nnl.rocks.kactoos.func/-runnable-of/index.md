[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RunnableOf](./index.md)

# RunnableOf

`class RunnableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Runnable`](http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/RunnableOf.kt#L19)

Func as Runnable.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RunnableOf(proc: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.md#X)`>, input: `[`X`](index.md#X)`)`<br>`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, input: `[`X`](index.md#X)`)`<br>`RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`X`](index.md#X)`>)`<br>`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>)`<br>`RunnableOf(callable: `[`Callable`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Callable.html)`<`[`X`](index.md#X)`>)``RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`X`](index.md#X)`>, input: `[`X`](index.md#X)`)`<br>Func as Runnable. |

### Functions

| Name | Summary |
|---|---|
| [run](run.md) | `fun run(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
