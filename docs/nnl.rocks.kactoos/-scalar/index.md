[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Scalar](./index.md)

# Scalar

`interface Scalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Scalar.

This class exists only because in JavaScript
implementing functional interface is prohibited

### Parameters

`T` - Type of value

**Since**
0.2

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `abstract operator fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](./index.md) |

### Inheritors

| Name | Summary |
|---|---|
| [Constant](../../nnl.rocks.kactoos.scalar/-constant/index.md) | `class Constant<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-constant/index.md#T)`>`<br>Constant value that never changes. |
| [False](../../nnl.rocks.kactoos.scalar/-false/index.md) | `class False : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical false. |
| [SyncScalar](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md) | `class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md#T)`>`<br>Scalar that is thread-safe. |
| [True](../../nnl.rocks.kactoos.scalar/-true/index.md) | `class True : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical truth. |
