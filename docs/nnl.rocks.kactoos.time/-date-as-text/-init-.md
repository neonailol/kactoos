[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [DateAsText](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`
`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`)`
`DateAsText()`
`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`

Formats the milliseconds using the ISO format.

### Parameters

`milliseconds` - Milliseconds to format.`DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Formats the milliseconds using the format and the default locale.

### Parameters

`milliseconds` - Milliseconds to format.

`format` - The format to use.`DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)`)`

Formats the milliseconds as date using the format and the locale.

### Parameters

`milliseconds` - Milliseconds to format as date.

`format` - The format to use.

`locale` - The locale to use for the format.`DateAsText(date: `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`)`

Formats the date with ISO format using the system zone.

### Parameters

`date` - The date to format.`DateAsText(date: `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Formats the date with to format using the default locale and the system
zone.

### Parameters

`date` - The date to format.

`format` - The format to use.`DateAsText(date: `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)`)`

Formats the date using the format and locale using the system default
zone.

### Parameters

`date` - The date to format.

`format` - The format to use.

`locale` - The locale to use.`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)`)`

Formats the date using the provided format string using the provided
locale.

### Parameters

`date` - The date to format.

`format` - The format string to use.

`locale` - The locale to use.`DateAsText(formatted: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`

Formatter for date instances.
Formats the date using the provided formatter.

### Parameters

`formatted` - The formatted date.

**Since**
0.27

