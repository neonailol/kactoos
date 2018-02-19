[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SyncScalar](./index.md)

# SyncScalar

`class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/SyncScalar.kt#L21)

Scalar that is thread-safe.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

### Parameters

`T` - Type of result

`origin` - The Scalar to cache

`mutex` - Sync lock

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncScalar(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)``SyncScalar(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>, mutex: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Scalar that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): `[`T`](index.md#T)<br>Convert it to the value. |
