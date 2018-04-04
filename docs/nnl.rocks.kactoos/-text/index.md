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
| [JoinedText](../../nnl.rocks.kactoos.text/-joined-text/index.md) | `class JoinedText : `[`Text`](./index.md)<br>Join a Text. |
| [LocalDateAsText](../../nnl.rocks.kactoos.time/-local-date-as-text/index.md) | `class LocalDateAsText : `[`Text`](./index.md)<br>Formatter for [LocalDate](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) instances. |
| [LocalDateTimeAsText](../../nnl.rocks.kactoos.time/-local-date-time-as-text/index.md) | `class LocalDateTimeAsText : `[`Text`](./index.md)<br>Formatter for [LocalDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html) instances. |
| [LowerText](../../nnl.rocks.kactoos.text/-lower-text/index.md) | `class LowerText : `[`Text`](./index.md)<br>Text in lower case. |
| [NormalizedText](../../nnl.rocks.kactoos.text/-normalized-text/index.md) | `class NormalizedText : `[`Text`](./index.md)<br>Normalize (replace sequences of whitespace characters by a single space) a Text. |
| [OffsetDateTimeAsText](../../nnl.rocks.kactoos.time/-offset-date-time-as-text/index.md) | `class OffsetDateTimeAsText : `[`Text`](./index.md)<br>Formatter for [OffsetDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) instances. |
| [RepeatedText](../../nnl.rocks.kactoos.text/-repeated-text/index.md) | `class RepeatedText : `[`Text`](./index.md)<br>Repeat an text count times. |
| [ReplacedText](../../nnl.rocks.kactoos.text/-replaced-text/index.md) | `class ReplacedText : `[`Text`](./index.md)<br>Replace the Text. |
| [ReversedText](../../nnl.rocks.kactoos.text/-reversed-text/index.md) | `class ReversedText : `[`Text`](./index.md)<br>Reverse the Text. |
| [RotatedText](../../nnl.rocks.kactoos.text/-rotated-text/index.md) | `class RotatedText : `[`Text`](./index.md)<br>Rotate (circular shift) a String of shift characters. |
| [SubText](../../nnl.rocks.kactoos.text/-sub-text/index.md) | `class SubText : `[`Text`](./index.md)<br>Extract a substring from a Text. |
| [SwappedCaseText](../../nnl.rocks.kactoos.text/-swapped-case-text/index.md) | `class SwappedCaseText : `[`Text`](./index.md)<br>Swaps the case of a Text changing upper and title case to lower case, and lower case to upper case. |
| [SyncText](../../nnl.rocks.kactoos.text/-sync-text/index.md) | `class SyncText : `[`Text`](./index.md)<br>Text that is thread-safe. |
| [TextBase64](../../nnl.rocks.kactoos.text/-text-base64/index.md) | `class TextBase64 : `[`Text`](./index.md)<br>Encodes the origin text using the Base64 encoding scheme. |
| [TextOf](../../nnl.rocks.kactoos.text/-text-of/index.md) | `class TextOf : `[`Text`](./index.md)<br>TextOf |
| [TrimmedLeftText](../../nnl.rocks.kactoos.text/-trimmed-left-text/index.md) | `class TrimmedLeftText : `[`Text`](./index.md)<br>Text without control characters (char &amp;lt;= 32) only from left. |
| [TrimmedRightText](../../nnl.rocks.kactoos.text/-trimmed-right-text/index.md) | `class TrimmedRightText : `[`Text`](./index.md)<br>Text without control characters (char &amp;lt;= 32) only from right. |
| [TrimmedText](../../nnl.rocks.kactoos.text/-trimmed-text/index.md) | `class TrimmedText : `[`Text`](./index.md)<br>Text without control characters (char &amp;lt;= 32) from both ends. |
| [UncheckedText](../../nnl.rocks.kactoos.text/-unchecked-text/index.md) | `class UncheckedText : `[`Text`](./index.md)<br>Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UpperText](../../nnl.rocks.kactoos.text/-upper-text/index.md) | `class UpperText : `[`Text`](./index.md)<br>Text in upper case. |
| [ZonedDateTimeAsText](../../nnl.rocks.kactoos.time/-zoned-date-time-as-text/index.md) | `class ZonedDateTimeAsText : `[`Text`](./index.md)<br>Formatter for [ZonedDateTime](http://docs.oracle.com/javase/8/docs/api/java/time/ZonedDateTime.html) instances. |
