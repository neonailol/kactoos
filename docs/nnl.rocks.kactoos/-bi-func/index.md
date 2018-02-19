---
title: BiFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos](../index.html) / [BiFunc](./index.html)

# BiFunc

`expect interface BiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Function that accepts two arguments.

**Since**
0.2

### Types

| [NoNulls](-no-nulls/index.html) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](-no-nulls/index.html#X)`, `[`Y`](-no-nulls/index.html#Y)`, `[`Z`](-no-nulls/index.html#Z)`>` |

### Functions

| [apply](apply.html) | `abstract fun apply(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Z`](index.html#Z)<br>Apply it. |

### Inheritors

| [BiFuncOf](../../nnl.rocks.kactoos.func/-bi-func-of/index.html) | `class BiFuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-bi-func-of/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-bi-func-of/index.html#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-bi-func-of/index.html#Z)`>`<br>Represents many possible inputs as [BiFunc](./index.md). |
| [IoCheckedBiFunc](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.html) | `class IoCheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.html#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.html#Z)`>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [NoNulls](-no-nulls/index.html) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](-no-nulls/index.html#X)`, `[`Y`](-no-nulls/index.html#Y)`, `[`Z`](-no-nulls/index.html#Z)`>` |
| [SolidBiFunc](../../nnl.rocks.kactoos.func/-solid-bi-func/index.html) | `class SolidBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-solid-bi-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-solid-bi-func/index.html#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-solid-bi-func/index.html#Z)`>`<br>BiFunc that is thread-safe and sticky. |
| [StickyBiFunc](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.html) | `class StickyBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.html#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.html#Z)`>`<br>Func that accepts two arguments and caches previously calculated values and doesn't recalculate again. |
| [SyncBiFunc](../../nnl.rocks.kactoos.func/-sync-bi-func/index.html) | `class SyncBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sync-bi-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sync-bi-func/index.html#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-sync-bi-func/index.html#Z)`>`<br>BiFunc that is thread-safe. |
| [UncheckedBiFunc](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.html) | `class UncheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.html#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.html#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.html#Z)`>`<br>BiFunc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

