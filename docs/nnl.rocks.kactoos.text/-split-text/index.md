[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [SplitText](.)

# SplitText

`class SplitText : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/SplitText.kt#L18)

Split the Text.

### Parameters

`origin` - The text

`regex` - The regex

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SplitText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, rgx: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`SplitText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, rgx: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`SplitText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, rgx: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`SplitText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, rgx: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)``SplitText(origin: `[`UncheckedText`](../-unchecked-text/index.md)`, regex: `[`UncheckedText`](../-unchecked-text/index.md)`)`<br>Split the Text. |

### Functions

| Name | Summary |
|---|---|
| [iterator](iterator.md) | `fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>` |
