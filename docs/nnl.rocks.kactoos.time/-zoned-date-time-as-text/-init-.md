[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [ZonedDateTimeAsText](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ZonedDateTimeAsText(date: `[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`

Formats the date using the provided format string using the provided
locale.

### Parameters

`date` - The date to format.

`format` - The format string to use.

`locale` - The locale to use.`ZonedDateTimeAsText(date: `[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().get())`

Formatter for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

### Parameters

`date` - The date to format.

`formatter` - The formatter to use.

**Since**
0.3

