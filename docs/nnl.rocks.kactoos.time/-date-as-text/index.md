[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [DateAsText](./index.md)

# DateAsText

`class DateAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Formatter for date instances.
Formats the date using the provided formatter.

### Parameters

`formatted` - The formatted date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`<br>`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`)`<br>`DateAsText()`<br>`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`<br>Formats the milliseconds using the ISO format.`DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Formats the milliseconds using the format and the default locale.`DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)`)`<br>Formats the milliseconds as date using the format and the locale.`DateAsText(date: `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`)`<br>Formats the date with ISO format using the system zone.`DateAsText(date: `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Formats the date with to format using the default locale and the system zone.`DateAsText(date: `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)`)`<br>Formats the date using the format and locale using the system default zone.`DateAsText(date: `[`TemporalAccessor`](http://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAccessor.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)`)`<br>Formats the date using the provided format string using the provided locale.`DateAsText(formatted: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Formatter for date instances. Formats the date using the provided formatter. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
