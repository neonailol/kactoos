[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [PaddedStartText](./index.md)

# PaddedStartText

`class PaddedStartText : `[`TextEnvelope`](../-text-envelope/index.md)

Text padded at start to reach the given length.

There is thread safe.

### Parameters

`text` - The text

`length` - The minimum length of the resulting string

`symbol` - The padding symbol

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PaddedStartText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, symbol: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>Text padded at start to reach the given length. |

### Inherited Functions

| Name | Summary |
|---|---|
| [asString](../-text-envelope/as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](../-text-envelope/equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](../-text-envelope/hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](../-text-envelope/to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
