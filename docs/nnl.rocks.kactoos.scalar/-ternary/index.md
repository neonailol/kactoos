---
title: Ternary - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [Ternary](./index.html)

# Ternary

`class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/Ternary.kt#L26)

Ternary operation.

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

### Parameters

`T` - Type of item.

`condition` - The condition

`consequent` - The consequent

`alternative` - The alternative

**Since**
0.8

### Constructors

| [&lt;init&gt;](-init-.html) | `Ternary(input: `[`X`](index.html#X)`, cnd: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`T`](index.html#T)`>, alter: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`T`](index.html#T)`>)`<br>`Ternary(cnd: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, cons: `[`T`](index.html#T)`, alter: `[`T`](index.html#T)`)`<br>`Ternary(cnd: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`T`](index.html#T)`, alter: `[`T`](index.html#T)`)``Ternary(condition: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, consequent: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>, alternative: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>)`<br>Ternary operation. |

### Functions

| [value](value.html) | `fun value(): `[`T`](index.html#T)<br>Convert it to the value. |

