---
title: WriterTo - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [WriterTo](./index.html)

# WriterTo

`class WriterTo : `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/WriterTo.kt#L28)

A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| [&lt;init&gt;](-init-.html) | `WriterTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`>)`<br>`WriterTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`<br>`WriterTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`<br>`WriterTo(stream: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, encoder: `[`CharsetEncoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetEncoder.html)`)``WriterTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`>)`<br>A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data. |

### Functions

| [close](close.html) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [flush](flush.html) | `fun flush(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.html) | `fun write(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

