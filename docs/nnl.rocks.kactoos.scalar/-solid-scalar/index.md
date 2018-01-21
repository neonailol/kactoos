[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [SolidScalar](.)

# SolidScalar

`class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/SolidScalar.kt#L21)

Cached and synchronized version of a Scalar.

Objects of this class are thread safe.

### Parameters

`T` - Type of result

`func` - Cached func

**See Also**

[StickyScalar](../-sticky-scalar/index.md)

[SyncScalar](../-sync-scalar/index.md)

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SolidScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>)``SolidScalar(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, T>)`<br>Cached and synchronized version of a Scalar. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): T`<br>Convert it to the value. |
