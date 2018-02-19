---
title: ZonedDateTimeOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [ZonedDateTimeOf](./index.html)

# ZonedDateTimeOf

`class ZonedDateTimeOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/ZonedDateTimeOf.kt#L18)

Parser for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

Parses the date using the formatter to create [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| [&lt;init&gt;](-init-.html) | `ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`<br>`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, zone: `[`ZoneId`](http://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html)`)`<br>Parses date using the provided format to create [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances.`ZonedDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)`>)`<br>Parser for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances. |

### Functions

| [value](value.html) | `fun value(): `[`ZonedDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html)<br>Convert it to the value. |

