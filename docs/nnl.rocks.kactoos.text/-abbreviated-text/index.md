[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [AbbreviatedText](./index.md)

# AbbreviatedText

`class AbbreviatedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/AbbreviatedText.kt#L16)

Abbreviates a Text using ellipses.

There is no thread-safety guarantee.

### Parameters

`origin` - The Text

`width` - Max width of the result string

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AbbreviatedText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>By default, the max line width is 80 characters.`AbbreviatedText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``AbbreviatedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = AbbreviatedText.MAX_WIDTH)`<br>Abbreviates a Text using ellipses. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
