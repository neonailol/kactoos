---
title: ZonedDateTimeAsText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [ZonedDateTimeAsText](./index.html)

# ZonedDateTimeAsText

`class ZonedDateTimeAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/ZonedDateTimeAsText.kt#L17)

Formatter for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

### Parameters

`date` - The date to format.

`formatter` - The formatter to use.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `ZonedDateTimeAsText(date: `[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`<br>Formats the date using the provided format string using the provided locale.`ZonedDateTimeAsText(date: `[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().get())`<br>Formatter for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances. |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

