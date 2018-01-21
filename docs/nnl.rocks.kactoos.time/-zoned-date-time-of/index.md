[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [ZonedDateTimeOf](.)

# ZonedDateTimeOf

`class ZonedDateTimeOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<ZonedDateTime>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/ZonedDateTimeOf.kt#L18)

Parser for [ZonedDateTime](#) instances.

Parses the date using the formatter to create [ZonedDateTime](#) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)`<br>`ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``ZonedDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, zone: ZoneId)`<br>Parses date using the provided format to create [ZonedDateTime](#) instances.`ZonedDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<ZonedDateTime>)`<br>Parser for [ZonedDateTime](#) instances. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): ZonedDateTime`<br>Convert it to the value. |
