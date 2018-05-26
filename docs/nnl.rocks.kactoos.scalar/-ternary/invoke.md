[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Ternary](index.md) / [invoke](./invoke.md)

# invoke

`fun invoke(): `[`T`](index.md#T)

Overrides [Scalar.invoke](../../nnl.rocks.kactoos/-scalar/invoke.md)

Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md)

**Return**
The value

**Since**
0.2

`operator fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(input: `[`X`](invoke.md#X)`, cnd: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`T`](invoke.md#T)`>, alter: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`T`](invoke.md#T)`>): `[`Ternary`](index.md)`<`[`T`](invoke.md#T)`>`

### Parameters

`input` - The input to pass to all of them

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative

`X` - Type of input

**Since**
0.5

