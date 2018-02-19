---
title: nnl.rocks.kactoos - kactoos-jvm
---

[kactoos-jvm](../index.html) / [nnl.rocks.kactoos](./index.html)

## Package nnl.rocks.kactoos

Top level package

### Types

| [BiFunc](-bi-func/index.html) | `expect interface BiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Function that accepts two arguments. |
| [BiProc](-bi-proc/index.html) | `expect interface BiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Proc that accepts two arguments. |
| [Bytes](-bytes/index.html) | `expect interface Bytes`<br>Bytes. |
| [Func](-func/index.html) | `expect interface Func<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Function. |
| [Input](-input/index.html) | `interface Input`<br>Input. |
| [Output](-output/index.html) | `interface Output`<br>Output. |
| [Proc](-proc/index.html) | `expect interface Proc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Procedure. |
| [Scalar](-scalar/index.html) | `expect interface Scalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Scalar. |
| [Text](-text/index.html) | `expect interface Text`<br>Text. |

### Type Aliases

| [KBiFunc](-k-bi-func.html) | `typealias KBiFunc<X, Y, Z> = (`[`X`](-k-bi-func.html#X)`, `[`Y`](-k-bi-func.html#Y)`) -> `[`Z`](-k-bi-func.html#Z)<br>Alias for [BiFunc](-bi-func/index.html) |
| [KBiProc](-k-bi-proc.html) | `typealias KBiProc<X, Y> = (`[`X`](-k-bi-proc.html#X)`, `[`Y`](-k-bi-proc.html#Y)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Alias for [BiProc](-bi-proc/index.html) |
| [KBytes](-k-bytes.html) | `typealias KBytes = () -> `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Alias for [Bytes](-bytes/index.html) |
| [KFunc](-k-func.html) | `typealias KFunc<X, Y> = (`[`X`](-k-func.html#X)`) -> `[`Y`](-k-func.html#Y)<br>Alias for [Func](-func/index.html) |
| [KProc](-k-proc.html) | `typealias KProc<X> = (`[`X`](-k-proc.html#X)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Alias for [Proc](-proc/index.html) |
| [KScalar](-k-scalar.html) | `typealias KScalar<T> = () -> `[`T`](-k-scalar.html#T)<br>Alias for [Scalar](-scalar/index.html) |
| [KText](-k-text.html) | `typealias KText = () -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Alias for [Text](-text/index.html) |

