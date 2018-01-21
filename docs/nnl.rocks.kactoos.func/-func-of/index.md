[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncOf](.)

# FuncOf

`class FuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/FuncOf.kt#L19)

Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - Func

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FuncOf(result: Y)`<br>`FuncOf(callable: Callable<Y>)`<br>`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y)`<br>`FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`FuncOf(runnable: Runnable)``FuncOf(func: KFunc<X, Y>)`<br>Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.md). |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Y`<br>Apply it. |
