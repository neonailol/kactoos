---
title: LocalDateTimeOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [LocalDateTimeOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)``LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Parses date using the provided format to create
[LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances.

### Parameters

`date` - The date to parse.

`format` - The format to use.`LocalDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`LocalDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)`>)`

Parser for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances.
Parses the date using the formatter to create
[LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

