[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TrimmedRightText](.)

# TrimmedRightText

`class TrimmedRightText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/TrimmedRightText.kt#L18)

Text without control characters (char &amp;lt;= 32) only from right.

### Parameters

`origin` -

The text




There is no thread-safety guarantee.




**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TrimmedRightText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>Text without control characters (char &amp;lt;= 32) only from right. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
