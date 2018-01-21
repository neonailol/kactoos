[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [ZonedDateTimeOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)`

### Parameters

`date` - The date to parse.

`formatter` - The formatter to use.`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`date` - The date to parse.`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, zone: ZoneId)`

Parses date using the provided format to create [ZonedDateTime](#) instances.

### Parameters

`date` - The date to parse.

`format` - The format to use.

`zone` - The zone to use.`ZonedDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<ZonedDateTime>)`

Parser for [ZonedDateTime](#) instances.

Parses the date using the formatter to create [ZonedDateTime](#) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

