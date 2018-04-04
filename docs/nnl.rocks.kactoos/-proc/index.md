[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Proc](./index.md)

# Proc

`interface Proc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Procedure.

### Parameters

`X` - Type of input

**Since**
0.2

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `abstract fun exec(input: `[`X`](index.md#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

### Inheritors

| Name | Summary |
|---|---|
| [AsyncFunc](../../nnl.rocks.kactoos.func/-async-func/index.md) | `class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../-func/index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.md#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](../../nnl.rocks.kactoos.func/-async-func/index.md#Y)`>>, `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.md#X)`>`<br>Func that runs in the background. |
| [IoCheckedProc](../../nnl.rocks.kactoos.func/-io-checked-proc/index.md) | `class IoCheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-proc/index.md#X)`>`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [java.io.IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [ProcOf](../../nnl.rocks.kactoos.func/-proc-of/index.md) | `class ProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-proc-of/index.md#X)`>`<br>Func as Proc. |
| [UncheckedProc](../../nnl.rocks.kactoos.func/-unchecked-proc/index.md) | `class UncheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-proc/index.md#X)`>`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
