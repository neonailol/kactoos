[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Ternary](./index.md)

# Ternary

`class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>`

Ternary operation.

There is no thread-safety guarantee.

### Parameters

`T` - Type of item.

`condition` - The condition

`consequent` - The consequent

`alternative` - The alternative

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Ternary(cnd: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, cons: `[`T`](index.md#T)`, alter: `[`T`](index.md#T)`)`<br>`Ternary(cnd: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`T`](index.md#T)`, alter: `[`T`](index.md#T)`)``Ternary(condition: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, consequent: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, alternative: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`<br>Ternary operation. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(input: `[`X`](invoke.md#X)`, cnd: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`T`](invoke.md#T)`>, alter: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`T`](invoke.md#T)`>): `[`Ternary`](./index.md)`<`[`T`](invoke.md#T)`>` |
