[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterAsOutputStream](./index.md)

# WriterAsOutputStream

`class WriterAsOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/WriterAsOutputStream.kt#L27)

Writer as [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html).

This class is for internal use only. Use [OutputStreamTo](../-output-stream-to/index.md)
instead.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`<br>`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`<br>`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``WriterAsOutputStream(writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, input: `[`ByteBuffer`](http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)` = ByteBuffer.allocate(size), output: `[`CharBuffer`](http://docs.oracle.com/javase/8/docs/api/java/nio/CharBuffer.html)` = CharBuffer.allocate(size))`<br>Writer as [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html). |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.md) | `fun write(data: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buffer: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buffer: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
