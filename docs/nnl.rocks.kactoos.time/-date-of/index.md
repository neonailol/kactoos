---
title: DateOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.time](../index.html) / [DateOf](./index.html)

# DateOf

`class DateOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/DateOf.kt#L18)

Parser for [Date](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html) instances.
Parsing the date using the provided formatter.

### Parameters

`parsed` - The parsed date

**Since**
0.27

### Constructors

| [&lt;init&gt;](-init-.html) | `DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`<br>`DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Parses the date using the provided format.`DateOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`>)`<br>Parser for [Date](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html) instances. Parsing the date using the provided formatter. |

### Functions

| [value](value.html) | `fun value(): `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)<br>Convert it to the value. |

