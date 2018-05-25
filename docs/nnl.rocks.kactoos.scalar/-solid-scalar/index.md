[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SolidScalar](./index.md)

# SolidScalar

`class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>`

Cached and synchronized version of a KScalar.

Objects of this class are thread safe.

### Parameters

`T` - Type of result

`func` - Cached func

**See Also**

[StickyScalar](../-sticky-scalar/index.md)

[SyncScalar](../-sync-scalar/index.md)

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SolidScalar(scalar: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)``SolidScalar(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`T`](index.md#T)`>)`<br>Cached and synchronized version of a KScalar. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
