[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Proc](.)

# Proc

`interface Proc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `abstract fun exec(input: X): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

### Inheritors

| Name | Summary |
|---|---|
| [AsyncFunc](../../nnl.rocks.kactoos.func/-async-func/index.md) | `class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../-func/index.md)`<X, Future<Y>>, Proc<X>`<br>Func that runs in the background. |
| [IoCheckedProc](../../nnl.rocks.kactoos.func/-io-checked-proc/index.md) | `class IoCheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Proc<X>`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [java.io.IOException](#) instead. |
| [ProcOf](../../nnl.rocks.kactoos.func/-proc-of/index.md) | `class ProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Proc<X>`<br>Func as Proc. |
| [UncheckedProc](../../nnl.rocks.kactoos.func/-unchecked-proc/index.md) | `class UncheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Proc<X>`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
