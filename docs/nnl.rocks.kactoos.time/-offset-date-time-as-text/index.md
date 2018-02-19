[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [OffsetDateTimeAsText](./index.md)

# OffsetDateTimeAsText

`class OffsetDateTimeAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/OffsetDateTimeAsText.kt#L18)

Formatter for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.

### Parameters

`date` - The date to format.

`formatter` - The formatter to use.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OffsetDateTimeAsText(date: `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`<br>Formats the date using the provided format string using the provided locale.`OffsetDateTimeAsText(date: `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().get())`<br>Formatter for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
