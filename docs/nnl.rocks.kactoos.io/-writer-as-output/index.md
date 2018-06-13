[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterAsOutput](./index.md)

# WriterAsOutput

`internal class WriterAsOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md)

Writer as [Output](../../nnl.rocks.kactoos/-output/index.md).

This class is for internal use only. Use [OutputTo](../-output-to/index.md) instead.

There is no thread-safety guarantee.

### Parameters

`writer` - Reader

`decoder` - Decoder

`size` - Buffer size

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WriterAsOutput(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`<br>Ctor.`WriterAsOutput(writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Writer as [Output](../../nnl.rocks.kactoos/-output/index.md). |

### Properties

| Name | Summary |
|---|---|
| [decoder](decoder.md) | `val decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)<br>Decoder |
| [size](size.md) | `val size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Buffer size |
| [writer](writer.md) | `val writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)<br>Reader |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |
