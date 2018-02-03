[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Scalar](./index.md)

# Scalar

`expect interface Scalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`

Scalar.

### Parameters

`T` - Type of value

**Since**
0.2

### Types

| Name | Summary |
|---|---|
| [NoNulls](-no-nulls/index.md) | `class NoNulls<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](-no-nulls/index.md#T)`>` |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `abstract fun value(): `[`T`](index.md#T)<br>Convert it to the value. |

### Inheritors

| Name | Summary |
|---|---|
| [And](../../nnl.rocks.kactoos.scalar/-and/index.md) | `class And : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndFunc](../../nnl.rocks.kactoos.scalar/-and-func/index.md) | `class AndFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndInThreads](../../nnl.rocks.kactoos.scalar/-and-in-threads/index.md) | `class AndInThreads : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndInThreadsFunc](../../nnl.rocks.kactoos.scalar/-and-in-threads-func/index.md) | `class AndInThreadsFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndWithIndex](../../nnl.rocks.kactoos.scalar/-and-with-index/index.md) | `class AndWithIndex : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [AndWithIndexFunc](../../nnl.rocks.kactoos.scalar/-and-with-index-func/index.md) | `class AndWithIndexFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [BoolOf](../../nnl.rocks.kactoos.scalar/-bool-of/index.md) | `class BoolOf : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Text as [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |
| [DateOf](../../nnl.rocks.kactoos.time/-date-of/index.md) | `class DateOf : `[`Scalar`](./index.md)`<`[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`>`<br>Parser for [Date](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html) instances. Parsing the date using the provided formatter. |
| [Equals](../../nnl.rocks.kactoos.scalar/-equals/index.md) | `class Equals<in T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../../nnl.rocks.kactoos.scalar/-equals/index.md#T)`>> : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Equals. |
| [False](../../nnl.rocks.kactoos.scalar/-false/index.md) | `class False : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical false. |
| [Folded](../../nnl.rocks.kactoos.scalar/-folded/index.md) | `class Folded<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-folded/index.md#T)`>`<br>Folds iterable via BiFunc. |
| [IoCheckedScalar](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md) | `class IoCheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md#T)`>`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead. |
| [IsBlank](../../nnl.rocks.kactoos.text/-is-blank/index.md) | `class IsBlank : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Determines if text is blank (consists of spaces) or no. |
| [ItemAt](../../nnl.rocks.kactoos.iterable/-item-at/index.md) | `class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.iterable/-item-at/index.md#T)`>`<br>Element from position in [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) or fallback value if iterable hasn't this position. |
| [ItemAt](../../nnl.rocks.kactoos.iterator/-item-at/index.md) | `class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.iterator/-item-at/index.md#T)`>`<br>Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) or fallback value if iterator hasn't this position. |
| [LocalDateTimeOf](../../nnl.rocks.kactoos.time/-local-date-time-of/index.md) | `class LocalDateTimeOf : `[`Scalar`](./index.md)`<`[`LocalDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)`>`<br>Parser for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances. Parses the date using the formatter to create [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances. |
| [NoNulls](-no-nulls/index.md) | `class NoNulls<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](-no-nulls/index.md#T)`>` |
| [Not](../../nnl.rocks.kactoos.scalar/-not/index.md) | `class Not : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical negative. |
| [NumberEnvelope](../../nnl.rocks.kactoos.scalar/-number-envelope/index.md) | `open class NumberEnvelope : `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, `[`Scalar`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |
| [NumberOf](../../nnl.rocks.kactoos.scalar/-number-of/index.md) | `class NumberOf : `[`NumberEnvelope`](../../nnl.rocks.kactoos.scalar/-number-envelope/index.md)`, `[`Scalar`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html). |
| [OffsetDateTimeOf](../../nnl.rocks.kactoos.time/-offset-date-time-of/index.md) | `class OffsetDateTimeOf : `[`Scalar`](./index.md)`<`[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`>`<br>Parser for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. Parses the date using the formatter to create [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. |
| [Or](../../nnl.rocks.kactoos.scalar/-or/index.md) | `class Or : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [OrFunc](../../nnl.rocks.kactoos.scalar/-or-func/index.md) | `class OrFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [PropertiesOf](../../nnl.rocks.kactoos.scalar/-properties-of/index.md) | `class PropertiesOf : `[`Scalar`](./index.md)`<`[`Properties`](http://docs.oracle.com/javase/8/docs/api/java/util/Properties.html)`>`<br>Map as [java.util.Properties](http://docs.oracle.com/javase/8/docs/api/java/util/Properties.html). |
| [Reduced](../../nnl.rocks.kactoos.scalar/-reduced/index.md) | `class Reduced<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`X`](../../nnl.rocks.kactoos.scalar/-reduced/index.md#X)`>`<br>Iterable, which elements are "reduced" through the func. |
| [RetryScalar](../../nnl.rocks.kactoos.scalar/-retry-scalar/index.md) | `class RetryScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-retry-scalar/index.md#T)`>`<br>Func that will try a few times before throwing an exception. |
| [ScalarOf](../../nnl.rocks.kactoos.scalar/-scalar-of/index.md) | `class ScalarOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-scalar-of/index.md#T)`>`<br>Creates scalar out of [T](../../nnl.rocks.kactoos.scalar/-scalar-of/index.md#T) |
| [SolidScalar](../../nnl.rocks.kactoos.scalar/-solid-scalar/index.md) | `class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-solid-scalar/index.md#T)`>`<br>Cached and synchronized version of a Scalar. |
| [StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md) | `class StickyScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md#T)`>`<br>Cached version of a Scalar. |
| [SyncScalar](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md) | `class SyncScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-sync-scalar/index.md#T)`>`<br>Scalar that is thread-safe. |
| [TempFile](../../nnl.rocks.kactoos.io/-temp-file/index.md) | `class TempFile : `[`Scalar`](./index.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, `[`Closeable`](http://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)<br>A temporary file. |
| [Ternary](../../nnl.rocks.kactoos.scalar/-ternary/index.md) | `class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-ternary/index.md#T)`>`<br>Ternary operation. |
| [True](../../nnl.rocks.kactoos.scalar/-true/index.md) | `class True : `[`Scalar`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical truth. |
| [UncheckedScalar](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md) | `class UncheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](./index.md)`<`[`T`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md#T)`>`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [ZonedDateTimeOf](../../nnl.rocks.kactoos.time/-zoned-date-time-of/index.md) | `class ZonedDateTimeOf : `[`Scalar`](./index.md)`<`[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`>`<br>Parser for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances. |
