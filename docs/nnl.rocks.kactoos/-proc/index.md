[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Proc](.)

# Proc

`@FunctionalInterface interface Proc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Proc.kt#L18)

Procedure.

If you don't want to have any checked exceptions being thrown
out of your Proc, you can use [nnl.rocks.kactoos.func.UncheckedProc](../../nnl.rocks.kactoos.func/-unchecked-proc/index.md)
decorator. Also you may try [nnl.rocks.kactoos.func.IoCheckedProc](../../nnl.rocks.kactoos.func/-io-checked-proc/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**See Also**

[nnl.rocks.kactoos.func.ProcOf](../../nnl.rocks.kactoos.func/-proc-of/index.md)

**Since**
0.1

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
