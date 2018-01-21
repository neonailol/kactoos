[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [BiProc](.)

# BiProc

`@FunctionalInterface interface BiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/BiProc.kt#L18)

Proc that accepts two arguments.

If you don't want to have any checked exceptions being thrown
out of your BiProc, you can use
[nnl.rocks.kactoos.func.UncheckedBiProc](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.md) decorator. Also
you may try [nnl.rocks.kactoos.func.IoCheckedBiProc](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

**Since**
0.20

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `abstract fun exec(first: X, second: Y): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

### Inheritors

| Name | Summary |
|---|---|
| [BiProcOf](../../nnl.rocks.kactoos.func/-bi-proc-of/index.md) | `class BiProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiProc<X, Y>`<br>Func as BiProc. |
| [IoCheckedBiProc](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.md) | `class IoCheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiProc<X, Y>`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |
| [UncheckedBiProc](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.md) | `class UncheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiProc<X, Y>`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
