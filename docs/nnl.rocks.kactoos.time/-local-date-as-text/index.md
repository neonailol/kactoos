[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [LocalDateAsText](./index.md)

# LocalDateAsText

`class LocalDateAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Formatter for [LocalDate](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) instances.

### Parameters

`date` - The date to format.

`formatter` - The formatter to use.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LocalDateAsText(date: `[`LocalDate`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().get())``LocalDateAsText(date: `[`LocalDate`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`<br>Formats the date using the provided format string using the provided locale.`LocalDateAsText(formatted: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Formatter for [LocalDate](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) instances. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
