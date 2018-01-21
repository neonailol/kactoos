[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [DateOf](.)

# DateOf

`class DateOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<Date>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/DateOf.kt#L18)

Parser for [Date](#) instances.
Parsing the date using the provided formatter.

### Parameters

`parsed` - The parsed date

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: DateTimeFormatter)`<br>`DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Parses the date using the provided format.`DateOf(parsed: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<Date>)`<br>Parser for [Date](#) instances. Parsing the date using the provided formatter. |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): Date`<br>Convert it to the value. |
