[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [RetryScalar](./index.md)

# RetryScalar

`class RetryScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>`

Func that will try a few times before throwing an exception.

There is no thread-safety guarantee.

### Parameters

`T` - Type of output

`origin` - Func original

`func` - Exit condition, returns TRUE if there is no reason to try

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RetryScalar(scalar: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RetryScalar(scalar: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)``RetryScalar(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>Func that will try a few times before throwing an exception. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T) |
