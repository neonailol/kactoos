[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Func](./index.md)

# Func

`expect interface Func<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Function.

**Since**
0.2

### Types

| Name | Summary |
|---|---|
| [NoNulls](-no-nulls/index.md) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](-no-nulls/index.md#X)`, `[`Y`](-no-nulls/index.md#Y)`>` |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `abstract fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |

### Inheritors

| Name | Summary |
|---|---|
| [AsyncFunc](../../nnl.rocks.kactoos.func/-async-func/index.md) | `class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.md#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](../../nnl.rocks.kactoos.func/-async-func/index.md#Y)`>>, `[`Proc`](../-proc/index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.md#X)`>`<br>Func that runs in the background. |
| [ChainedFunc](../../nnl.rocks.kactoos.func/-chained-func/index.md) | `class ChainedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-chained-func/index.md#X)`, `[`Z`](../../nnl.rocks.kactoos.func/-chained-func/index.md#Z)`>`<br>Composed function. |
| [FuncOf](../../nnl.rocks.kactoos.func/-func-of/index.md) | `class FuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-func-of/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-func-of/index.md#Y)`>`<br>Represents many possible inputs as [Func](./index.md). |
| [FuncWithFallback](../../nnl.rocks.kactoos.func/-func-with-fallback/index.md) | `class FuncWithFallback<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-func-with-fallback/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-func-with-fallback/index.md#Y)`>`<br>Func with a fallback plan. |
| [IoCheckedFunc](../../nnl.rocks.kactoos.func/-io-checked-func/index.md) | `class IoCheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-io-checked-func/index.md#Y)`>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [NoNulls](-no-nulls/index.md) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](-no-nulls/index.md#X)`, `[`Y`](-no-nulls/index.md#Y)`>` |
| [RepeatedFunc](../../nnl.rocks.kactoos.func/-repeated-func/index.md) | `class RepeatedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-repeated-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-repeated-func/index.md#Y)`>`<br>Func that repeats its calculation a few times before returning the last result. If [times](#) is equal or less than zero [RepeatedFunc.apply](../../nnl.rocks.kactoos.func/-repeated-func/apply.md) will return an exception. |
| [RetryFunc](../../nnl.rocks.kactoos.func/-retry-func/index.md) | `class RetryFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-retry-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-retry-func/index.md#Y)`>`<br>Func that will try a few times before throwing an exception. |
| [SolidFunc](../../nnl.rocks.kactoos.func/-solid-func/index.md) | `class SolidFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-solid-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-solid-func/index.md#Y)`>`<br>Func that is thread-safe and sticky. |
| [StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.md) | `class StickyFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sticky-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sticky-func/index.md#Y)`>`<br>Func that caches previously calculated values and doesn't recalculate again. |
| [SyncFunc](../../nnl.rocks.kactoos.func/-sync-func/index.md) | `class SyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sync-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sync-func/index.md#Y)`>`<br>Func that is thread-safe. |
| [UncheckedFunc](../../nnl.rocks.kactoos.func/-unchecked-func/index.md) | `class UncheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-unchecked-func/index.md#Y)`>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
