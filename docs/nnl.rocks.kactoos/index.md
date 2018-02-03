[kactoos-jvm](../index.md) / [nnl.rocks.kactoos](./index.md)

## Package nnl.rocks.kactoos


Top level package

### Types

| Name | Summary |
|---|---|
| [BiFunc](-bi-func/index.md) | `expect interface BiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Function that accepts two arguments. |
| [BiProc](-bi-proc/index.md) | `expect interface BiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Proc that accepts two arguments. |
| [Bytes](-bytes/index.md) | `expect interface Bytes`<br>Bytes. |
| [Func](-func/index.md) | `expect interface Func<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Function. |
| [Input](-input/index.md) | `interface Input`<br>Input. |
| [Output](-output/index.md) | `interface Output`<br>Output. |
| [Proc](-proc/index.md) | `expect interface Proc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Procedure. |
| [Scalar](-scalar/index.md) | `expect interface Scalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Scalar. |
| [Text](-text/index.md) | `expect interface Text`<br>Text. |

### Type Aliases

| Name | Summary |
|---|---|
| [KBiFunc](-k-bi-func.md) | `typealias KBiFunc<X, Y, Z> = (`[`X`](-k-bi-func.md#X)`, `[`Y`](-k-bi-func.md#Y)`) -> `[`Z`](-k-bi-func.md#Z)<br>Alias for [BiFunc](-bi-func/index.md) |
| [KBiProc](-k-bi-proc.md) | `typealias KBiProc<X, Y> = (`[`X`](-k-bi-proc.md#X)`, `[`Y`](-k-bi-proc.md#Y)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Alias for [BiProc](-bi-proc/index.md) |
| [KBytes](-k-bytes.md) | `typealias KBytes = () -> `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Alias for [Bytes](-bytes/index.md) |
| [KFunc](-k-func.md) | `typealias KFunc<X, Y> = (`[`X`](-k-func.md#X)`) -> `[`Y`](-k-func.md#Y)<br>Alias for [Func](-func/index.md) |
| [KProc](-k-proc.md) | `typealias KProc<X> = (`[`X`](-k-proc.md#X)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Alias for [Proc](-proc/index.md) |
| [KScalar](-k-scalar.md) | `typealias KScalar<T> = () -> `[`T`](-k-scalar.md#T)<br>Alias for [Scalar](-scalar/index.md) |
| [KText](-k-text.md) | `typealias KText = () -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Alias for [Text](-text/index.md) |
