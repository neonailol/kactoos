[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [LocalDateTimeOf](.)

# LocalDateTimeOf

`class LocalDateTimeOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<LocalDateTime>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/LocalDateTimeOf.kt#L17)

Parser for [LocalDateTime](#) instances.
Parses the date using the formatter to create
[LocalDateTime](#) instances.

### Parameters

`parsed` - The parsed date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)``LocalDateTimeOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Parses date using the provided format to create [LocalDateTime](#) instances.`LocalDateTimeOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<LocalDateTime>)`<br>Parser for [LocalDateTime](#) instances. Parses the date using the formatter to create [LocalDateTime](#) instances. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): LocalDateTime`<br>Convert it to the value. |
