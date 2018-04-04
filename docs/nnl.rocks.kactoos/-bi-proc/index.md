[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [BiProc](./index.md)

# BiProc

`interface BiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Proc that accepts two arguments.

**Since**
0.2

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `abstract fun exec(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

### Inheritors

| Name | Summary |
|---|---|
| [BiProcOf](../../nnl.rocks.kactoos.func/-bi-proc-of/index.md) | `class BiProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-bi-proc-of/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-bi-proc-of/index.md#Y)`>`<br>Func as BiProc. |
| [IoCheckedBiProc](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.md) | `class IoCheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-io-checked-bi-proc/index.md#Y)`>`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [UncheckedBiProc](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.md) | `class UncheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-unchecked-bi-proc/index.md#Y)`>`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
