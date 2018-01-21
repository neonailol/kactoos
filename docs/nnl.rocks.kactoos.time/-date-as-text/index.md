[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [DateAsText](.)

# DateAsText

`class DateAsText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/time/DateAsText.kt#L22)

Formatter for date instances.
Formats the date using the provided formatter.

### Parameters

`formatted` - The formatted date.

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DateAsText(date: TemporalAccessor, formatter: DateTimeFormatter)`<br>`DateAsText(date: TemporalAccessor)`<br>`DateAsText()`<br>`DateAsText(date: TemporalAccessor, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`<br>Formats the milliseconds using the ISO format.`DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Formats the milliseconds using the format and the default locale.`DateAsText(milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: Locale)`<br>Formats the milliseconds as date using the format and the locale.`DateAsText(date: Date)`<br>Formats the date with ISO format using the system zone.`DateAsText(date: Date, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Formats the date with to format using the default locale and the system zone.`DateAsText(date: Date, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: Locale)`<br>Formats the date using the format and locale using the system default zone.`DateAsText(date: TemporalAccessor, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: Locale)`<br>Formats the date using the provided format string using the provided locale.`DateAsText(formatted: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Formatter for date instances. Formats the date using the provided formatter. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
