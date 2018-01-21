[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [BiFunc](.)

# BiFunc

`interface BiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `abstract fun apply(first: X, second: Y): Z`<br>Apply it. |

### Inheritors

| Name | Summary |
|---|---|
| [BiFuncOf](../../nnl.rocks.kactoos.func/-bi-func-of/index.md) | `class BiFuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiFunc<X, Y, Z>`<br>Represents many possible inputs as BiFunc. |
| [IoCheckedBiFunc](../../nnl.rocks.kactoos.func/-io-checked-bi-func/index.md) | `class IoCheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiFunc<X, Y, Z>`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |
| [SolidBiFunc](../../nnl.rocks.kactoos.func/-solid-bi-func/index.md) | `class SolidBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiFunc<X, Y, Z>`<br>BiFunc that is thread-safe and sticky. |
| [StickyBiFunc](../../nnl.rocks.kactoos.func/-sticky-bi-func/index.md) | `class StickyBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiFunc<X, Y, Z>`<br>Func that accepts two arguments and caches previously calculated values and doesn't recalculate again. |
| [SyncBiFunc](../../nnl.rocks.kactoos.func/-sync-bi-func/index.md) | `class SyncBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiFunc<X, Y, Z>`<br>BiFunc that is thread-safe. |
| [UncheckedBiFunc](../../nnl.rocks.kactoos.func/-unchecked-bi-func/index.md) | `class UncheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : BiFunc<X, Y, Z>`<br>BiFunc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
