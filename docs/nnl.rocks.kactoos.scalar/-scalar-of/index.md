[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [ScalarOf](.)

# ScalarOf

`class ScalarOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/ScalarOf.kt#L13)

Creates scalar out of [T](#)

### Parameters

`T` - Type of scalar

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ScalarOf(origin: T)``ScalarOf(origin: KScalar<T>)`<br>Creates scalar out of [T](#) |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): T`<br>Convert it to the value. |
