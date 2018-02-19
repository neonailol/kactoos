[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [BiFunc](./index.md)

# BiFunc

`expect interface BiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Function that accepts two arguments.

**Since**
0.2

### Types

| Name | Summary |
|---|---|
| [NoNulls](-no-nulls/index.md) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](-no-nulls/index.md#X)`, `[`Y`](-no-nulls/index.md#Y)`, `[`Z`](-no-nulls/index.md#Z)`>` |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `abstract fun apply(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Z`](index.md#Z)<br>Apply it. |

### Inheritors

| Name | Summary |
|---|---|
| [BiFuncOf](../../nnl.rocks.kactoos.func/-bi-func-of/index.md) | `class BiFuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-bi-func-of/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-bi-func-of/index.md#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-bi-func-of/index.md#Z)`>`<br>Represents many possible inputs as [BiFunc](./index.md). |
| [IoCheckedBiFunc](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.md) | `class IoCheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.md#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.md#Z)`>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [NoNulls](-no-nulls/index.md) | `class NoNulls<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](-no-nulls/index.md#X)`, `[`Y`](-no-nulls/index.md#Y)`, `[`Z`](-no-nulls/index.md#Z)`>` |
| [SolidBiFunc](../../nnl.rocks.kactoos.func/-solid-bi-func/index.md) | `class SolidBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-solid-bi-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-solid-bi-func/index.md#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-solid-bi-func/index.md#Z)`>`<br>BiFunc that is thread-safe and sticky. |
| [StickyBiFunc](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.md) | `class StickyBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.md#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.md#Z)`>`<br>Func that accepts two arguments and caches previously calculated values and doesn't recalculate again. |
| [SyncBiFunc](../../nnl.rocks.kactoos.func/-sync-bi-func/index.md) | `class SyncBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-sync-bi-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-sync-bi-func/index.md#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-sync-bi-func/index.md#Z)`>`<br>BiFunc that is thread-safe. |
| [UncheckedBiFunc](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.md) | `class UncheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.md#X)`, `[`Y`](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.md#Y)`, `[`Z`](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.md#Z)`>`<br>BiFunc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
