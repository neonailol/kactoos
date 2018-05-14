[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [ZonedDateTimeOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`

### Parameters

`date` - The date to parse.

`formatter` - The formatter to use.`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`date` - The date to parse.`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, zone: `[`ZoneId`](http://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html)`)`

Parses date using the provided format to create [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

### Parameters

`date` - The date to parse.

`format` - The format to use.

`zone` - The zone to use.`ZonedDateTimeOf(parsed: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`>)`

Parser for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

Parses the date using the formatter to create [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

