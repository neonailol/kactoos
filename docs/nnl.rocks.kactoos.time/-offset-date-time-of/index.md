[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [OffsetDateTimeOf](./index.md)

# OffsetDateTimeOf

`class OffsetDateTimeOf : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`>`

Parser for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.
Parses the date using the formatter to create
[OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)``OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, offset: `[`ZoneOffset`](http://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html)`)`<br>Parses date using the provided format to create [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.`OffsetDateTimeOf(parsed: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`>)`<br>Parser for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. Parses the date using the formatter to create [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) |
