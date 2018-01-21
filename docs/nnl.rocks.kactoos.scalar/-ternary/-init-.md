[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Ternary](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`Ternary(input: X, cnd: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>, alter: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, T>)`

### Parameters

`input` - The input to pass to all of them

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative

`X` - Type of input

**Since**
0.9

`Ternary(cnd: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, cons: T, alter: T)`

### Parameters

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative

**Since**
0.9

`Ternary(cnd: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: T, alter: T)`

### Parameters

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative`Ternary(condition: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, consequent: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>, alternative: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<T>)`

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

