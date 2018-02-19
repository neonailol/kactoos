[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TrimmedText](./index.md)

# TrimmedText

`class TrimmedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/TrimmedText.kt#L18)

Text without control characters (char &amp;lt;= 32) from both ends.

### Parameters

`origin` -

The text




There is no thread-safety guarantee.




**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TrimmedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>Text without control characters (char &amp;lt;= 32) from both ends. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
