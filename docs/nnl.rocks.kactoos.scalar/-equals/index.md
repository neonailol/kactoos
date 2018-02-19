[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Equals](./index.md)

# Equals

`class Equals<in T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.md#T)`>> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/Equals.kt#L23)

Equals.

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

### Parameters

`first` - The first scalar to compare.

`second` - The second scalar to compare.

`T` - Type of object to compare

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Equals(first: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>, second: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)`<br>Equals. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert it to the value. |
