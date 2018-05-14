[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterTo](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`WriterTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

### Parameters

`path` - The path`WriterTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

### Parameters

`file` - The file`WriterTo(stream: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`

### Parameters

`stream` - The output`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`output` - The input

`charset` - The charset`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, encoder: `[`CharsetEncoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetEncoder.html)`)`

### Parameters

`output` - The input

`encoder` - Charset encoder

**Since**
0.13.1

`WriterTo(target: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`>)`

A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

