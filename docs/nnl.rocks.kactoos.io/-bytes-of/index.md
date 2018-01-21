[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [BytesOf](.)

# BytesOf

`class BytesOf : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/BytesOf.kt#L23)

A [Bytes](../../nnl.rocks.kactoos/-bytes/index.md) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BytesOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>`BytesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`BytesOf(file: File)`<br>`BytesOf(path: Path)`<br>`BytesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`BytesOf(rdr: Reader)`<br>`BytesOf(rdr: Reader, charset: Charset)`<br>`BytesOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`BytesOf(rdr: Reader, charset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`BytesOf(rdr: Reader, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`BytesOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`<br>`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`BytesOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>`BytesOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: Charset)`<br>`BytesOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`<br>`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: Charset)`<br>`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`BytesOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)``BytesOf(origin: KBytes)`<br>A [Bytes](../../nnl.rocks.kactoos/-bytes/index.md) that encapsulates other sources of data. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
