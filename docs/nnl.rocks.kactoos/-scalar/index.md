[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Scalar](./index.md)

# Scalar

`interface Scalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Scalar.

This class exists only because in JavaScript
implementing functional interface is prohibited

### Parameters

`T` - Type of value

**Since**
0.2

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `abstract operator fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](./index.md) |

### Inheritors

| Name | Summary |
|---|---|
| [CheckedScalar](../../nnl.rocks.kactoos.scalar/-checked-scalar/index.md) | `class CheckedScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, E> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-checked-scalar/index.md#T)`>`<br>Scalar that wraps an original checked exception thrown by the origin using the given wrapping function. |
| [Constant](../../nnl.rocks.kactoos.scalar/-constant/index.md) | `class Constant<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-constant/index.md#T)`>`<br>Constant value that never changes. |
| [Equality](../../nnl.rocks.kactoos.scalar/-equality/index.md) | `class Equality<T : `[`Bytes`](../-bytes/index.md)`> : `[`Scalar`](./index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>Equality. |
| [Equals](../../nnl.rocks.kactoos.scalar/-equals/index.md) | `class Equals<in T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../../nnl.rocks.kactoos.scalar/-equals/index.md#T)`>> : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Equals. |
| [False](../../nnl.rocks.kactoos.scalar/-false/index.md) | `class False : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical false. |
| [FirstOf](../../nnl.rocks.kactoos.scalar/-first-of/index.md) | `class FirstOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-first-of/index.md#T)`>`<br>Find first element in a list that satisfies specified condition. |
| [HighestOf](../../nnl.rocks.kactoos.scalar/-highest-of/index.md) | `class HighestOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../../nnl.rocks.kactoos.scalar/-highest-of/index.md#T)`>> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-highest-of/index.md#T)`>`<br>Find the highest item. |
| [InheritanceLevel](../../nnl.rocks.kactoos.scalar/-inheritance-level/index.md) | `class InheritanceLevel : `[`Scalar`](./index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>Calculates number of superclasses between base and derived class. |
| [IoCheckedScalar](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md) | `class IoCheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md#T)`>`<br>KScalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [LowestOf](../../nnl.rocks.kactoos.scalar/-lowest-of/index.md) | `class LowestOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../../nnl.rocks.kactoos.scalar/-lowest-of/index.md#T)`>> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-lowest-of/index.md#T)`>`<br>Find the lowest item. |
| [Not](../../nnl.rocks.kactoos.scalar/-not/index.md) | `class Not : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical negative. |
| [NumberEnvelope](../../nnl.rocks.kactoos.scalar/-number-envelope/index.md) | `open class NumberEnvelope : `[`Scalar`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |
| [ScalarWithFallback](../../nnl.rocks.kactoos.scalar/-scalar-with-fallback/index.md) | `class ScalarWithFallback<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-scalar-with-fallback/index.md#T)`>`<br>Scalar with a fallback plan. |
| [SumOfDoubleScalar](../../nnl.rocks.kactoos.scalar/-sum-of-double-scalar/index.md) | `class SumOfDoubleScalar : `[`Scalar`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Double Scalar which sums up the values of other Scalars of the same type. |
| [SumOfFloatScalar](../../nnl.rocks.kactoos.scalar/-sum-of-float-scalar/index.md) | `class SumOfFloatScalar : `[`Scalar`](./index.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>`<br>Float Scalar which sums up the values of other Scalars of the same type |
| [SumOfIntScalar](../../nnl.rocks.kactoos.scalar/-sum-of-int-scalar/index.md) | `class SumOfIntScalar : `[`Scalar`](./index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>Integer Scalar which sums up the values of other Scalars of the same type |
| [SumOfLongScalar](../../nnl.rocks.kactoos.scalar/-sum-of-long-scalar/index.md) | `class SumOfLongScalar : `[`Scalar`](./index.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`<br>Long Scalar which sums up the values of other Scalars of the same type |
| [SyncScalar](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md) | `class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md#T)`>`<br>Scalar that is thread-safe. |
| [TempFile](../../nnl.rocks.kactoos.io/-temp-file/index.md) | `class TempFile : `[`Scalar`](./index.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, `[`Closeable`](http://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)<br>A temporary file. |
| [True](../../nnl.rocks.kactoos.scalar/-true/index.md) | `class True : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical truth. |
| [UncheckedScalar](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md) | `class UncheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md#T)`>`<br>Scalar that throws unchecked [UncheckedIOException](http://docs.oracle.com/javase/8/docs/api/java/io/UncheckedIOException.html) instead of checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
