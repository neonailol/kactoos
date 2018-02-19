---
title: OffsetDateTimeAsText.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [OffsetDateTimeAsText](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`OffsetDateTimeAsText(date: `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: `[`Locale`](http://docs.oracle.com/javase/8/docs/api/java/util/Locale.html)` = Locale.getDefault(Locale.Category.FORMAT))`

Formats the date using the provided format string using the provided
locale.

### Parameters

`date` - The date to format.

`format` - The format string to use.

`locale` - The locale to use.`OffsetDateTimeAsText(date: `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)` = Iso().get())`

Formatter for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.

### Parameters

`date` - The date to format.

`formatter` - The formatter to use.

**Since**
0.27

