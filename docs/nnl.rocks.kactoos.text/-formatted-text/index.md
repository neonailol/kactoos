[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [FormattedText](.)

# FormattedText

`class FormattedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/FormattedText.kt#L25)

Text in Sprinf format.

New formatted string with specified locale.

### Parameters

`pattern` - Pattern

`locale` - Format locale

`arguments` -

Arguments




There is no thread-safety guarantee.




**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FormattedText(ptn: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, vararg arguments: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>`FormattedText(ptn: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, vararg arguments: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>`FormattedText(ptn: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, arguments: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`<br>`FormattedText(ptn: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, arguments: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`<br>New formatted string with default locale.`FormattedText(ptn: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: Locale, vararg arguments: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>`FormattedText(ptn: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, locale: Locale, vararg arguments: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>`FormattedText(ptn: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, locale: Locale, arguments: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`<br>New formatted string with specified locale.`FormattedText(pattern: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, locale: Locale, arguments: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`<br>Text in Sprinf format. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
