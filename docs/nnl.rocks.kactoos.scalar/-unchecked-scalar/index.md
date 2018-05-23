[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [UncheckedScalar](./index.md)

# UncheckedScalar

`class UncheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>`

Scalar that throws unchecked [UncheckedIOException](http://docs.oracle.com/javase/8/docs/api/java/io/UncheckedIOException.html) instead of checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`origin` - Encapsulated origin

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedScalar(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`<br>Scalar that throws unchecked [UncheckedIOException](http://docs.oracle.com/javase/8/docs/api/java/io/UncheckedIOException.html) instead of checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T) |
