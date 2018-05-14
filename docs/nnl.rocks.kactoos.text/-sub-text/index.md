[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [SubText](./index.md)

# SubText

`class SubText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Extract a substring from a Text.

### Parameters

`origin` - The Text

`start` - Start position in the text

`end` -

End position in the text




There is no thread-safety guarantee.




**Since**
0.11

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SubText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SubText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, finish: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SubText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SubText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, finish: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``SubText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, start: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, end: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>)`<br>Extract a substring from a Text. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
