---
title: LocalDateTimeAsText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [LocalDateTimeAsText](./index.html)

# LocalDateTimeAsText

`class LocalDateTimeAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/LocalDateTimeAsText.kt#L19)

Formatter for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances.

### Parameters

`date` - The date to format.

`formatter` - The formatter to use.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `LocalDateTimeAsText(date: `[`LocalDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`<br>Formats the date using the provided format string using the provided locale.`LocalDateTimeAsText(date: `[`LocalDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().get())`<br>Formatter for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances. |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

