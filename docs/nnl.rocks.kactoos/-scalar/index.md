[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Scalar](.)

# Scalar

`@FunctionalInterface interface Scalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Scalar.kt#L27)

Scalar.

If you don't want to have any checked exceptions being
thrown out of your Scalar, you can use [UncheckedScalar](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)
decorator. Also you may try [IoCheckedScalar](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md).

If you want to cache the result of the Scalar and make
sure it doesn't calculate anything twice, you can use [StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md) decorator.

There is no thread-safety guarantee.

``` kotlin
//Unresolved: samples.scalar
```

### Parameters

`T` - Type of result

**See Also**

[StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md)

[UncheckedScalar](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)

[IoCheckedScalar](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md)

**Since**
0.1

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `abstract fun value(): T`<br>Convert it to the value. |

### Inheritors

| Name | Summary |
|---|---|
| [And](../../nnl.rocks.kactoos.scalar/-and/index.md) | `class And : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndFunc](../../nnl.rocks.kactoos.scalar/-and-func/index.md) | `class AndFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndInThreads](../../nnl.rocks.kactoos.scalar/-and-in-threads/index.md) | `class AndInThreads : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndInThreadsFunc](../../nnl.rocks.kactoos.scalar/-and-in-threads-func/index.md) | `class AndInThreadsFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndWithIndex](../../nnl.rocks.kactoos.scalar/-and-with-index/index.md) | `class AndWithIndex : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [AndWithIndexFunc](../../nnl.rocks.kactoos.scalar/-and-with-index-func/index.md) | `class AndWithIndexFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [BoolOf](../../nnl.rocks.kactoos.scalar/-bool-of/index.md) | `class BoolOf : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Text as [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |
| [DateOf](../../nnl.rocks.kactoos.time/-date-of/index.md) | `class DateOf : Scalar<Date>`<br>Parser for [Date](#) instances. Parsing the date using the provided formatter. |
| [Equals](../../nnl.rocks.kactoos.scalar/-equals/index.md) | `class Equals<in T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Equals. |
| [False](../../nnl.rocks.kactoos.scalar/-false/index.md) | `class False : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical false. |
| [IoCheckedScalar](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md) | `class IoCheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |
| [IsBlank](../../nnl.rocks.kactoos.text/-is-blank/index.md) | `class IsBlank : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Determines if text is blank (consists of spaces) or no. |
| [ItemAt](../../nnl.rocks.kactoos.iterable/-item-at/index.md) | `class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Element from position in [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) or fallback value if iterable hasn't this position. |
| [ItemAt](../../nnl.rocks.kactoos.iterator/-item-at/index.md) | `class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) or fallback value if iterator hasn't this position. |
| [LocalDateTimeOf](../../nnl.rocks.kactoos.time/-local-date-time-of/index.md) | `class LocalDateTimeOf : Scalar<LocalDateTime>`<br>Parser for [LocalDateTime](#) instances. Parses the date using the formatter to create [LocalDateTime](#) instances. |
| [Not](../../nnl.rocks.kactoos.scalar/-not/index.md) | `class Not : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical negative. |
| [NumberEnvelope](../../nnl.rocks.kactoos.scalar/-number-envelope/index.md) | `open class NumberEnvelope : `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, Scalar<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |
| [NumberOf](../../nnl.rocks.kactoos.scalar/-number-of/index.md) | `class NumberOf : `[`NumberEnvelope`](../../nnl.rocks.kactoos.scalar/-number-envelope/index.md)`, Scalar<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html). |
| [OffsetDateTimeOf](../../nnl.rocks.kactoos.time/-offset-date-time-of/index.md) | `class OffsetDateTimeOf : Scalar<OffsetDateTime>`<br>Parser for [OffsetDateTime](#) instances. Parses the date using the formatter to create [OffsetDateTime](#) instances. |
| [Or](../../nnl.rocks.kactoos.scalar/-or/index.md) | `class Or : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [OrFunc](../../nnl.rocks.kactoos.scalar/-or-func/index.md) | `class OrFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [PropertiesOf](../../nnl.rocks.kactoos.iterable/-properties-of/index.md) | `class PropertiesOf : Scalar<Properties>`<br>Map as [java.util.Properties](#). |
| [Reduced](../../nnl.rocks.kactoos.scalar/-reduced/index.md) | `class Reduced<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<X>`<br>Iterable, which elements are "reduced" through the func. |
| [RetryScalar](../../nnl.rocks.kactoos.scalar/-retry-scalar/index.md) | `class RetryScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Func that will try a few times before throwing an exception. |
| [ScalarOf](../../nnl.rocks.kactoos.scalar/-scalar-of/index.md) | `class ScalarOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Creates scalar out of [T](#) |
| [SolidScalar](../../nnl.rocks.kactoos.scalar/-solid-scalar/index.md) | `class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Cached and synchronized version of a Scalar. |
| [StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md) | `class StickyScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Cached version of a Scalar. |
| [SyncScalar](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md) | `class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Scalar that is thread-safe. |
| [Ternary](../../nnl.rocks.kactoos.scalar/-ternary/index.md) | `class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Ternary operation. |
| [True](../../nnl.rocks.kactoos.scalar/-true/index.md) | `class True : Scalar<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical truth. |
| [UncheckedScalar](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md) | `class UncheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : Scalar<T>`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [ZonedDateTimeOf](../../nnl.rocks.kactoos.time/-zoned-date-time-of/index.md) | `class ZonedDateTimeOf : Scalar<ZonedDateTime>`<br>Parser for [ZonedDateTime](#) instances. |
