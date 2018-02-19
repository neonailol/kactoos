[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterAsOutputStream](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`

### Parameters

`wtr` - Writer

`charset` - Charset`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`
`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`wtr` - Reader

`charset` - Charset

`size` - Buffer size`WriterAsOutputStream(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`wtr` - Reader

`size` - Buffer size

**Since**
0.13.3

`WriterAsOutputStream(writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, input: `[`ByteBuffer`](http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html)` = ByteBuffer.allocate(size), output: `[`CharBuffer`](http://docs.oracle.com/javase/8/docs/api/java/nio/CharBuffer.html)` = CharBuffer.allocate(size))`

Writer as [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html).

This class is for internal use only. Use [OutputStreamTo](../-output-stream-to/index.md)
instead.

There is no thread-safety guarantee.

**Since**
0.13

