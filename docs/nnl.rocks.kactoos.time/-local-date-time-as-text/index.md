[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [LocalDateTimeAsText](./index.md)

# LocalDateTimeAsText

`class LocalDateTimeAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Formatter for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LocalDateTimeAsText(date: `[`LocalDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().invoke())``LocalDateTimeAsText(date: `[`LocalDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`<br>Formats the date using the provided format string using the provided locale.`LocalDateTimeAsText(formatted: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Formatter for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
