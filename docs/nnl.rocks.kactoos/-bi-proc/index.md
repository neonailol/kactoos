[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [BiProc](.)

# BiProc

`interface BiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

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
