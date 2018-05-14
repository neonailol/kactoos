[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [OffsetDateTimeAsText](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`OffsetDateTimeAsText(date: `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().invoke())``OffsetDateTimeAsText(date: `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`

Formats the date using the provided format string using the provided
locale.

### Parameters

`date` - The date to format.

`format` - The format string to use.

`locale` - The locale to use.`OffsetDateTimeAsText(formatted: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`

Formatter for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.

**Since**
0.3

