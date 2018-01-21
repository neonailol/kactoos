[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [LocalDateTimeOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)``LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Parses date using the provided format to create
[LocalDateTime](#) instances.

### Parameters

`date` - The date to parse.

`format` - The format to use.`LocalDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<LocalDateTime>)`

Parser for [LocalDateTime](#) instances.
Parses the date using the formatter to create
[LocalDateTime](#) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

