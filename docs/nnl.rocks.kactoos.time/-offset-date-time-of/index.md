[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [OffsetDateTimeOf](.)

# OffsetDateTimeOf

`class OffsetDateTimeOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<OffsetDateTime>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/OffsetDateTimeOf.kt#L19)

Parser for [OffsetDateTime](#) instances.
Parses the date using the formatter to create
[OffsetDateTime](#) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)``OffsetDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, offset: ZoneOffset)`<br>Parses date using the provided format to create [OffsetDateTime](#) instances.`OffsetDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<OffsetDateTime>)`<br>Parser for [OffsetDateTime](#) instances. Parses the date using the formatter to create [OffsetDateTime](#) instances. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): OffsetDateTime`<br>Convert it to the value. |
