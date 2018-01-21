[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Ternary](.)

# Ternary

`class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/Ternary.kt#L26)

Ternary operation.

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

### Parameters

`T` - Type of item.

`condition` - The condition

`consequent` - The consequent

`alternative` - The alternative

**Since**
0.8

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Ternary(input: X, cnd: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>, alter: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>)`<br>`Ternary(cnd: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, cons: T, alter: T)`<br>`Ternary(cnd: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: T, alter: T)``Ternary(condition: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, consequent: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>, alternative: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>)`<br>Ternary operation. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): T`<br>Convert it to the value. |
