[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Text](.)

# Text

`@FunctionalInterface interface Text : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<Text>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Text.kt#L18)

Text.

If you don't want to have any checked exceptions being
thrown out of your Text, you can use [UncheckedText](../../nnl.rocks.kactoos.text/-unchecked-text/index.md) decorator.

There is no thread-safety guarantee.

**See Also**

[nnl.rocks.kactoos.text.TextOf](../../nnl.rocks.kactoos.text/-text-of/index.md)

**Since**
0.1

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `abstract fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

### Inheritors

| Name | Summary |
|---|---|
| [Base64Text](../../nnl.rocks.kactoos.text/-base64-text/index.md) | `class Base64Text : Text`<br>Decodes the origin text using the Base64 encoding scheme. |
| [ComparableText](../../nnl.rocks.kactoos.text/-comparable-text/index.md) | `class ComparableText : Text, `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<Text>`<br>Text implementing Comparable. |
| [DateAsText](../../nnl.rocks.kactoos.time/-date-as-text/index.md) | `class DateAsText : Text`<br>Formatter for date instances. Formats the date using the provided formatter. |
| [FormattedText](../../nnl.rocks.kactoos.text/-formatted-text/index.md) | `class FormattedText : Text`<br>Text in Sprinf format. |
| [HexOf](../../nnl.rocks.kactoos.text/-hex-of/index.md) | `class HexOf : Text`<br>Hexadecimal representation of Bytes. |
| [JoinedText](../../nnl.rocks.kactoos.text/-joined-text/index.md) | `class JoinedText : Text`<br>Join a Text. |
| [LowerText](../../nnl.rocks.kactoos.text/-lower-text/index.md) | `class LowerText : Text`<br>Text in lower case. |
| [NormalizedText](../../nnl.rocks.kactoos.text/-normalized-text/index.md) | `class NormalizedText : Text`<br>Normalize (replace sequences of whitespace characters by a single space) a Text. |
| [RepeatedText](../../nnl.rocks.kactoos.text/-repeated-text/index.md) | `class RepeatedText : Text`<br>Repeat an text count times. |
| [ReplacedText](../../nnl.rocks.kactoos.text/-replaced-text/index.md) | `class ReplacedText : Text`<br>Replace the Text. |
| [ReversedText](../../nnl.rocks.kactoos.text/-reversed-text/index.md) | `class ReversedText : Text`<br>Reverse the Text. |
| [RotatedText](../../nnl.rocks.kactoos.text/-rotated-text/index.md) | `class RotatedText : Text`<br>Rotate (circular shift) a String of shift characters. |
| [SubText](../../nnl.rocks.kactoos.text/-sub-text/index.md) | `class SubText : Text`<br>Extract a substring from a Text. |
| [SwappedCaseText](../../nnl.rocks.kactoos.text/-swapped-case-text/index.md) | `class SwappedCaseText : Text`<br>Swaps the case of a Text changing upper and title case to lower case, and lower case to upper case. |
| [SyncText](../../nnl.rocks.kactoos.text/-sync-text/index.md) | `class SyncText : Text`<br>Text that is thread-safe. |
| [TextBase64](../../nnl.rocks.kactoos.text/-text-base64/index.md) | `class TextBase64 : Text`<br>Encodes the origin text using the Base64 encoding scheme. |
| [TextOf](../../nnl.rocks.kactoos.text/-text-of/index.md) | `class TextOf : Text`<br>TextOf |
| [TrimmedLeftText](../../nnl.rocks.kactoos.text/-trimmed-left-text/index.md) | `class TrimmedLeftText : Text`<br>Text without control characters (char &amp;lt;= 32) only from left. |
| [TrimmedRightText](../../nnl.rocks.kactoos.text/-trimmed-right-text/index.md) | `class TrimmedRightText : Text`<br>Text without control characters (char &amp;lt;= 32) only from right. |
| [TrimmedText](../../nnl.rocks.kactoos.text/-trimmed-text/index.md) | `class TrimmedText : Text`<br>Text without control characters (char &amp;lt;= 32) from both ends. |
| [UncheckedText](../../nnl.rocks.kactoos.text/-unchecked-text/index.md) | `class UncheckedText : Text`<br>Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UpperText](../../nnl.rocks.kactoos.text/-upper-text/index.md) | `class UpperText : Text`<br>Text in upper case. |
