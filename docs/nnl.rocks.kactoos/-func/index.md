---
title: Func - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos](../index.html) / [Func](./index.html)

# Func

`expect interface Func<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Function.

**Since**
0.2

### Types

| [NoNulls](-no-nulls/index.html) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](-no-nulls/index.html#X)`, `[`Y`](-no-nulls/index.html#Y)`>` |

### Functions

| [apply](apply.html) | `abstract fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

### Inheritors

| [AsyncFunc](../../nnl.rocks.kactoos.func/-async-func/index.html) | `class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.html#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](../../nnl.rocks.kactoos.func/-async-func/index.html#Y)`>>, `[`Proc`](../-proc/index.html)`<`[`X`](../../nnl.rocks.kactoos.func/-async-func/index.html#X)`>`<br>Func that runs in the background. |
| [ChainedFunc](../../nnl.rocks.kactoos.func/-chained-func/index.html) | `class ChainedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-chained-func/index.html#X)`, `[`Z`](../../nnl.rocks.kactoos.func/-chained-func/index.html#Z)`>`<br>Composed function. |
| [FuncOf](../../nnl.rocks.kactoos.func/-func-of/index.html) | `class FuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-func-of/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-func-of/index.html#Y)`>`<br>Represents many possible inputs as [Func](./index.md). |
| [FuncWithFallback](../../nnl.rocks.kactoos.func/-func-with-fallback/index.html) | `class FuncWithFallback<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-func-with-fallback/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-func-with-fallback/index.html#Y)`>`<br>Func with a fallback plan. |
| [IoCheckedFunc](../../nnl.rocks.kactoos.func/-io-checked-func/index.html) | `class IoCheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-io-checked-func/index.html#Y)`>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [NoNulls](-no-nulls/index.html) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](-no-nulls/index.html#X)`, `[`Y`](-no-nulls/index.html#Y)`>` |
| [RepeatedFunc](../../nnl.rocks.kactoos.func/-repeated-func/index.html) | `class RepeatedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-repeated-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-repeated-func/index.html#Y)`>`<br>Func that repeats its calculation a few times before returning the last result. If [times](#) is equal or less than zero [RepeatedFunc.apply](../../nnl.rocks.kactoos.func/-repeated-func/apply.html) will return an exception. |
| [RetryFunc](../../nnl.rocks.kactoos.func/-retry-func/index.html) | `class RetryFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-retry-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-retry-func/index.html#Y)`>`<br>Func that will try a few times before throwing an exception. |
| [SolidFunc](../../nnl.rocks.kactoos.func/-solid-func/index.html) | `class SolidFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-solid-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-solid-func/index.html#Y)`>`<br>Func that is thread-safe and sticky. |
| [StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.html) | `class StickyFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sticky-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sticky-func/index.html#Y)`>`<br>Func that caches previously calculated values and doesn't recalculate again. |
| [SyncFunc](../../nnl.rocks.kactoos.func/-sync-func/index.html) | `class SyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sync-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sync-func/index.html#Y)`>`<br>Func that is thread-safe. |
| [UncheckedFunc](../../nnl.rocks.kactoos.func/-unchecked-func/index.html) | `class UncheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-unchecked-func/index.html#Y)`>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

