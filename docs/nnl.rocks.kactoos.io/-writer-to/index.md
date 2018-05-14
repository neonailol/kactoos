[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterTo](./index.md)

# WriterTo

`class WriterTo : `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)

A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WriterTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`<br>`WriterTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`<br>`WriterTo(stream: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, encoder: `[`CharsetEncoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetEncoder.html)`)``WriterTo(target: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`>)`<br>A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data. |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [flush](flush.md) | `fun flush(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.md) | `fun write(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
