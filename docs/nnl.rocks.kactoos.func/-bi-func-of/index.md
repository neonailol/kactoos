[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [BiFuncOf](.)

# BiFuncOf

`class BiFuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/BiFuncOf.kt#L21)

Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`func` - Func

**Since**
0.20

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BiFuncOf(fnc: KBiFunc<X, Y, Z>)`<br>`BiFuncOf(result: Z)`<br>`BiFuncOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Z>)`<br>`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Z)`<br>`BiFuncOf(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<X, Y>, result: Z)`<br>`BiFuncOf(callable: Callable<Z>)`<br>`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`BiFuncOf(runnable: Runnable)`<br>`BiFuncOf(runnable: Runnable, input: X, result: Z)``BiFuncOf(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>)`<br>Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md). |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(first: X, second: Y): Z`<br>Apply it. |
