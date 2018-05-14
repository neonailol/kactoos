[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [OutputStreamTo](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`OutputStreamTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

### Parameters

`path` - The path`OutputStreamTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

### Parameters

`file` - The file`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`wtr` - Writer

`charset` - Charset

**Since**
0.13.1

`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)``OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`wtr` - Reader

`charset` - Charset

`size` - Buffer size

**Since**
0.13.1

`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, ddr: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`wtr` - Reader

`ddr` - Charset decoder

`size` - Buffer size

**Since**
0.13.1

`OutputStreamTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`output` - The input`OutputStreamTo(target: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`>)`

An [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.3

