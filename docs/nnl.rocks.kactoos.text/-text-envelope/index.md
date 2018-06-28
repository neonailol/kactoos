[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TextEnvelope](./index.md)

# TextEnvelope

`abstract class TextEnvelope : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Text envelope that provides equals and hashCode methods.

### Parameters

`origin` - String value of the envelope.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TextEnvelope(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`TextEnvelope(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>`TextEnvelope(string: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``TextEnvelope(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Text envelope that provides equals and hashCode methods. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [JoinedText](../-joined-text/index.md) | `class JoinedText : `[`TextEnvelope`](./index.md)<br>Join a Text. |
| [LowerText](../-lower-text/index.md) | `class LowerText : `[`TextEnvelope`](./index.md)<br>Text in lower case. |
| [NormalizedText](../-normalized-text/index.md) | `class NormalizedText : `[`TextEnvelope`](./index.md)<br>Normalize (replace sequences of whitespace characters by a single space) a Text. |
| [PaddedStartText](../-padded-start-text/index.md) | `class PaddedStartText : `[`TextEnvelope`](./index.md)<br>Text padded at start to reach the given length. |
| [RepeatedText](../-repeated-text/index.md) | `class RepeatedText : `[`TextEnvelope`](./index.md)<br>Repeat an text count times. |
| [ReplacedText](../-replaced-text/index.md) | `class ReplacedText : `[`TextEnvelope`](./index.md)<br>Replace the Text. |
| [ReversedText](../-reversed-text/index.md) | `class ReversedText : `[`TextEnvelope`](./index.md)<br>Reverse the Text. |
| [RotatedText](../-rotated-text/index.md) | `class RotatedText : `[`TextEnvelope`](./index.md)<br>Rotate (circular shift) a String of shift characters. |
| [SubText](../-sub-text/index.md) | `class SubText : `[`TextEnvelope`](./index.md)<br>Extract a substring from a Text. |
| [SwappedCaseText](../-swapped-case-text/index.md) | `class SwappedCaseText : `[`TextEnvelope`](./index.md)<br>Swaps the case of a Text changing upper and title case to lower case, and lower case to upper case. |
| [TextBase64](../-text-base64/index.md) | `class TextBase64 : `[`TextEnvelope`](./index.md)<br>Encodes the origin text using the Base64 encoding scheme. |
| [TextOf](../-text-of/index.md) | `class TextOf : `[`TextEnvelope`](./index.md)<br>TextOf |
| [TrimmedText](../-trimmed-text/index.md) | `class TrimmedText : `[`TextEnvelope`](./index.md)<br>Text without whitespace characters from both ends. |
