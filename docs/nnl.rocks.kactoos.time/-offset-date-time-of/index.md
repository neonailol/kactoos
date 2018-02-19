---
title: OffsetDateTimeOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [OffsetDateTimeOf](./index.html)

# OffsetDateTimeOf

`class OffsetDateTimeOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/OffsetDateTimeOf.kt#L19)

Parser for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.
Parses the date using the formatter to create
[OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| [&lt;init&gt;](-init-.html) | `OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)``OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, offset: `[`ZoneOffset`](http://docs.oracle.com/javase/8/docs/api/java/time/ZoneOffset.html)`)`<br>Parses date using the provided format to create [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances.`OffsetDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)`>)`<br>Parser for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. Parses the date using the formatter to create [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. |

### Functions

| [value](value.html) | `fun value(): `[`OffsetDateTime`](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)<br>Convert it to the value. |

