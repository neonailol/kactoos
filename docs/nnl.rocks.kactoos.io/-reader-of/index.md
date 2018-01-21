[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [ReaderOf](.)

# ReaderOf

`class ReaderOf : Reader` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/ReaderOf.kt#L33)

A [Reader](#) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ReaderOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>`ReaderOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: Charset)`<br>`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`<br>`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, charset: Charset)`<br>`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ReaderOf(path: Path)`<br>`ReaderOf(file: File)`<br>`ReaderOf(url: URL)`<br>`ReaderOf(uri: URI)`<br>`ReaderOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`<br>`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`<br>`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, charset: Charset = StandardCharsets.UTF_8)`<br>`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, decoder: CharsetDecoder)`<br>`ReaderOf(stream: InputStream, charset: Charset = StandardCharsets.UTF_8)`<br>`ReaderOf(stream: InputStream, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ReaderOf(stream: InputStream, decoder: CharsetDecoder)``ReaderOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>Ctor.`ReaderOf(source: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<Reader>)`<br>A [Reader](#) that encapsulates other sources of data. |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [read](read.md) | `fun read(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
