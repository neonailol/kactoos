[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RunnableOf](.)

# RunnableOf

`class RunnableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Runnable` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/RunnableOf.kt#L19)

Func as Runnable.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RunnableOf(proc: Callable<X>, input: X)`<br>`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, input: X)`<br>`RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, X>)`<br>`RunnableOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`RunnableOf(callable: Callable<X>)``RunnableOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, X>, input: X)`<br>Func as Runnable. |

### Functions

| Name | Summary |
|---|---|
| [run](run.md) | `fun run(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
