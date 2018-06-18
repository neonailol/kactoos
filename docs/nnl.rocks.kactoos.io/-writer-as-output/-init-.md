[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterAsOutput](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`WriterAsOutput(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`

Ctor.

### Parameters

`wtr` - Reader

`cset` - Charset

`max` - Buffer size`WriterAsOutput(writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Writer as [Output](../../nnl.rocks.kactoos/-output/index.md).

This class is for internal use only. Use [OutputTo](../-output-to/index.md) instead.

There is no thread-safety guarantee.

### Parameters

`writer` - Reader

`decoder` - Decoder

`size` - Buffer size

**Since**
0.3

