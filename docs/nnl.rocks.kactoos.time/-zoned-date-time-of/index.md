[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [ZonedDateTimeOf](./index.md)

# ZonedDateTimeOf

`class ZonedDateTimeOf : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`>`

Parser for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

Parses the date using the formatter to create [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`<br>`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, zone: `[`ZoneId`](http://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html)`)`<br>Parses date using the provided format to create [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.`ZonedDateTimeOf(parsed: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`>)`<br>Parser for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) |
