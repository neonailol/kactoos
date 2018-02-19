[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [AbbreviatedText](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`AbbreviatedText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

By default, the max line width is 80 characters.

### Parameters

`text` - The Text`AbbreviatedText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`text` - A String

`max` - Max width of the result string`AbbreviatedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, width: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = AbbreviatedText.MAX_WIDTH)`

Abbreviates a Text using ellipses.

There is no thread-safety guarantee.

### Parameters

`origin` - The Text

`width` - Max width of the result string

**Since**
0.3

