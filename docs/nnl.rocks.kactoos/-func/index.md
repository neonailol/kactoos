[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Func](.)

# Func

`@FunctionalInterface interface Func<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Func.kt#L26)

Function.

If you don't want to have any checked exceptions being thrown
out of your Func, you can use
[nnl.rocks.kactoos.func.UncheckedFunc](../../nnl.rocks.kactoos.func/-unchecked-func/index.md) decorator. Also
you may try [nnl.rocks.kactoos.func.IoCheckedFunc](../../nnl.rocks.kactoos.func/-io-checked-func/index.md).

If you want to cache the result of the Func and
make sure it doesn't calculate anything twice, you can use
[nnl.rocks.kactoos.func.StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.md) decorator.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

**See Also**

[nnl.rocks.kactoos.func.StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.md)

[nnl.rocks.kactoos.func.UncheckedFunc](../../nnl.rocks.kactoos.func/-unchecked-func/index.md)

[nnl.rocks.kactoos.func.IoCheckedFunc](../../nnl.rocks.kactoos.func/-io-checked-func/index.md)

**Since**
0.1

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `abstract fun apply(input: X): Y`<br>Apply it. |

### Inheritors

| Name | Summary |
|---|---|
| [AsyncFunc](../../nnl.rocks.kactoos.func/-async-func/index.md) | `class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Future<Y>>, `[`Proc`](../-proc/index.md)`<X>`<br>Func that runs in the background. |
| [ChainedFunc](../../nnl.rocks.kactoos.func/-chained-func/index.md) | `class ChainedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Z>`<br>Composed function. |
| [FuncOf](../../nnl.rocks.kactoos.func/-func-of/index.md) | `class FuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Represents many possible inputs as Func. |
| [FuncWithFallback](../../nnl.rocks.kactoos.func/-func-with-fallback/index.md) | `class FuncWithFallback<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func with a fallback plan. |
| [IoCheckedFunc](../../nnl.rocks.kactoos.func/-io-checked-func/index.md) | `class IoCheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |
| [RepeatedFunc](../../nnl.rocks.kactoos.func/-repeated-func/index.md) | `class RepeatedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that repeats its calculation a few times before returning the last result. If [times](#) is equal or less than zero [RepeatedFunc.apply](../../nnl.rocks.kactoos.func/-repeated-func/apply.md) will return an exception. |
| [RetryFunc](../../nnl.rocks.kactoos.func/-retry-func/index.md) | `class RetryFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that will try a few times before throwing an exception. |
| [SolidFunc](../../nnl.rocks.kactoos.func/-solid-func/index.md) | `class SolidFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that is thread-safe and sticky. |
| [StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.md) | `class StickyFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that caches previously calculated values and doesn't recalculate again. |
| [SyncFunc](../../nnl.rocks.kactoos.func/-sync-func/index.md) | `class SyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that is thread-safe. |
| [UncheckedFunc](../../nnl.rocks.kactoos.func/-unchecked-func/index.md) | `class UncheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Func<X, Y>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
