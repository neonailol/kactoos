[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Text](./index.md)

# Text

`interface Text`

Text.

**Since**
0.2

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `abstract fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

### Inheritors

| Name | Summary |
|---|---|
| [AbbreviatedText](../../nnl.rocks.kactoos.text/-abbreviated-text/index.md) | `class AbbreviatedText : `[`Text`](./index.md)<br>Abbreviates a Text using ellipses. |
| [Base64Text](../../nnl.rocks.kactoos.text/-base64-text/index.md) | `class Base64Text : `[`Text`](./index.md)<br>Decodes the origin text using the Base64 encoding scheme. |
| [ComparableText](../../nnl.rocks.kactoos.text/-comparable-text/index.md) | `class ComparableText : `[`Text`](./index.md)`, `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Text`](./index.md)`>`<br>Text implementing Comparable. |
| [DateAsText](../../nnl.rocks.kactoos.time/-date-as-text/index.md) | `class DateAsText : `[`Text`](./index.md)<br>Formatter for date instances. Formats the date using the provided formatter. |
| [FormattedText](../../nnl.rocks.kactoos.text/-formatted-text/index.md) | `class FormattedText : `[`Text`](./index.md)<br>Text in Sprinf format. |
| [HexOf](../../nnl.rocks.kactoos.text/-hex-of/index.md) | `class HexOf : `[`Text`](./index.md)<br>Hexadecimal representation of Bytes. |
| [LocalDateAsText](../../nnl.rocks.kactoos.time/-local-date-as-text/index.md) | `class LocalDateAsText : `[`Text`](./index.md)<br>Formatter for [LocalDate](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) instances. |
| [LocalDateTimeAsText](../../nnl.rocks.kactoos.time/-local-date-time-as-text/index.md) | `class LocalDateTimeAsText : `[`Text`](./index.md)<br>Formatter for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances. |
| [OffsetDateTimeAsText](../../nnl.rocks.kactoos.time/-offset-date-time-as-text/index.md) | `class OffsetDateTimeAsText : `[`Text`](./index.md)<br>Formatter for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. |
| [RandomText](../../nnl.rocks.kactoos.text/-random-text/index.md) | `class RandomText : `[`Text`](./index.md)<br>Random text. |
| [SyncText](../../nnl.rocks.kactoos.text/-sync-text/index.md) | `class SyncText : `[`Text`](./index.md)<br>Text that is thread-safe. |
| [TextEnvelope](../../nnl.rocks.kactoos.text/-text-envelope/index.md) | `abstract class TextEnvelope : `[`Text`](./index.md)<br>Text envelope that provides equals and hashCode methods. |
| [TrimmedLeftText](../../nnl.rocks.kactoos.text/-trimmed-left-text/index.md) | `class TrimmedLeftText : `[`Text`](./index.md)<br>Text without control characters (char &amp;lt;= 32) only from left. |
| [TrimmedRightText](../../nnl.rocks.kactoos.text/-trimmed-right-text/index.md) | `class TrimmedRightText : `[`Text`](./index.md)<br>Text without control characters (char &amp;lt;= 32) only from right. |
| [UncheckedText](../../nnl.rocks.kactoos.text/-unchecked-text/index.md) | `class UncheckedText : `[`Text`](./index.md)<br>Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UpperText](../../nnl.rocks.kactoos.text/-upper-text/index.md) | `class UpperText : `[`Text`](./index.md)<br>Text in upper case. |
| [ZonedDateTimeAsText](../../nnl.rocks.kactoos.time/-zoned-date-time-as-text/index.md) | `class ZonedDateTimeAsText : `[`Text`](./index.md)<br>Formatter for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances. |
