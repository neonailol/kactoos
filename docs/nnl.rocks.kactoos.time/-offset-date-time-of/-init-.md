[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [OffsetDateTimeOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)``OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, offset: ZoneOffset)`

Parses date using the provided format to create
[OffsetDateTime](#) instances.

### Parameters

`date` - The date to parse.

`format` - The format to use.

`offset` - The offset to use.`OffsetDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<OffsetDateTime>)`

Parser for [OffsetDateTime](#) instances.
Parses the date using the formatter to create
[OffsetDateTime](#) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

