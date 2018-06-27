[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.text](./index.md)

## Package nnl.rocks.kactoos.text

Text.

### Types

| Name | Summary |
|---|---|
| [AbbreviatedText](-abbreviated-text/index.md) | `class AbbreviatedText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Abbreviates a Text using ellipses. |
| [Base64Text](-base64-text/index.md) | `class Base64Text : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Decodes the origin text using the Base64 encoding scheme. |
| [ComparableText](-comparable-text/index.md) | `class ComparableText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)`, `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Text`](../nnl.rocks.kactoos/-text/index.md)`>`<br>Text implementing Comparable. |
| [FormattedText](-formatted-text/index.md) | `class FormattedText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text in Sprinf format. |
| [HexOf](-hex-of/index.md) | `class HexOf : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Hexadecimal representation of Bytes. |
| [IsBlank](-is-blank/index.md) | `class IsBlank : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Determines if text is blank (consists of spaces) or no. |
| [JoinedText](-joined-text/index.md) | `class JoinedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Join a Text. |
| [LowerText](-lower-text/index.md) | `class LowerText : `[`TextEnvelope`](-text-envelope/index.md)<br>Text in lower case. |
| [NormalizedText](-normalized-text/index.md) | `class NormalizedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Normalize (replace sequences of whitespace characters by a single space) a Text. |
| [PaddedStartText](-padded-start-text/index.md) | `class PaddedStartText : `[`TextEnvelope`](-text-envelope/index.md)<br>Text padded at start to reach the given length. |
| [RandomText](-random-text/index.md) | `class RandomText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Random text. |
| [RepeatedText](-repeated-text/index.md) | `class RepeatedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Repeat an text count times. |
| [ReplacedText](-replaced-text/index.md) | `class ReplacedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Replace the Text. |
| [ReversedText](-reversed-text/index.md) | `class ReversedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Reverse the Text. |
| [RotatedText](-rotated-text/index.md) | `class RotatedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Rotate (circular shift) a String of shift characters. |
| [SplitText](-split-text/index.md) | `class SplitText : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Text`](../nnl.rocks.kactoos/-text/index.md)`>`<br>Split the Text. |
| [SubText](-sub-text/index.md) | `class SubText : `[`TextEnvelope`](-text-envelope/index.md)<br>Extract a substring from a Text. |
| [SwappedCaseText](-swapped-case-text/index.md) | `class SwappedCaseText : `[`TextEnvelope`](-text-envelope/index.md)<br>Swaps the case of a Text changing upper and title case to lower case, and lower case to upper case. |
| [SyncText](-sync-text/index.md) | `class SyncText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text that is thread-safe. |
| [TextBase64](-text-base64/index.md) | `class TextBase64 : `[`TextEnvelope`](-text-envelope/index.md)<br>Encodes the origin text using the Base64 encoding scheme. |
| [TextEnvelope](-text-envelope/index.md) | `abstract class TextEnvelope : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text envelope that provides equals and hashCode methods. |
| [TextOf](-text-of/index.md) | `class TextOf : `[`TextEnvelope`](-text-envelope/index.md)<br>TextOf |
| [TrimmedLeftText](-trimmed-left-text/index.md) | `class TrimmedLeftText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text without control characters (char &amp;lt;= 32) only from left. |
| [TrimmedRightText](-trimmed-right-text/index.md) | `class TrimmedRightText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text without control characters (char &amp;lt;= 32) only from right. |
| [TrimmedText](-trimmed-text/index.md) | `class TrimmedText : `[`TextEnvelope`](-text-envelope/index.md)<br>Text without whitespace characters from both ends. |
| [UncheckedText](-unchecked-text/index.md) | `class UncheckedText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UpperText](-upper-text/index.md) | `class UpperText : `[`Text`](../nnl.rocks.kactoos/-text/index.md)<br>Text in upper case. |
