[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Ternary](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Ternary(input: `[`X`](index.md#X)`, cnd: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`>, alter: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`T`](index.md#T)`>)`

### Parameters

`input` - The input to pass to all of them

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative

`X` - Type of input

**Since**
0.9

`Ternary(cnd: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, cons: `[`T`](index.md#T)`, alter: `[`T`](index.md#T)`)`

### Parameters

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative

**Since**
0.9

`Ternary(cnd: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, cons: `[`T`](index.md#T)`, alter: `[`T`](index.md#T)`)`

### Parameters

`cnd` - The condition

`cons` - The consequent

`alter` - The alternative`Ternary(condition: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, consequent: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, alternative: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`

Ternary operation.

There is no thread-safety guarantee.

### Parameters

`T` - Type of item.

`condition` - The condition

`consequent` - The consequent

`alternative` - The alternative

**Since**
0.8

