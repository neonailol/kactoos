[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputOf](.)

# InputOf

`class InputOf : `[`Input`](../../nnl.rocks.kactoos/-input/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/InputOf.kt#L30)

An [Input](../../nnl.rocks.kactoos/-input/index.md) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.11.8

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputOf(input: KInput)`<br>`InputOf(file: File)`<br>`InputOf(path: Path)`<br>`InputOf(uri: URI)`<br>`InputOf(url: URL)`<br>`InputOf(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<URL>)`<br>`InputOf(rdr: Reader)`<br>`InputOf(rdr: Reader, charset: Charset)`<br>`InputOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`InputOf(rdr: Reader, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`InputOf(rdr: Reader, charset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`InputOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`InputOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>`InputOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: Charset)`<br>`InputOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`InputOf(source: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`InputOf(source: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`<br>`InputOf(source: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`InputOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`InputOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`<br>`InputOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`InputOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`InputOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: Charset)`<br>`InputOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`InputOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`<br>`InputOf(src: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>`InputOf(stream: InputStream)``InputOf(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>An [Input](../../nnl.rocks.kactoos/-input/index.md) that encapsulates other sources of data. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): InputStream`<br>Get read access to it. |
