[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TextOf](.)

# TextOf

`class TextOf : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/TextOf.kt#L35)

TextOf

### Parameters

`origin` -

The Scalar of String




There is no thread-safety guarantee.




**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`TextOf(url: URL)`<br>`TextOf(uri: URI)`<br>`TextOf(path: Path)`<br>`TextOf(file: File)`<br>`TextOf(input: InputStream)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, cset: Charset)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, cset: Charset)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`TextOf(rdr: Reader)`<br>`TextOf(rdr: Reader, cset: Charset)`<br>`TextOf(rdr: Reader, cset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, cset: Charset)`<br>`TextOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>`TextOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, cset: Charset)`<br>`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`TextOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`<br>`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, cset: Charset)`<br>`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TextOf(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cset: Charset)`<br>`TextOf(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TextOf(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)` |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
