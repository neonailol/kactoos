---
title: WriterTo.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [WriterTo](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`WriterTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`>)``WriterTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

### Parameters

`path` - The path`WriterTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

### Parameters

`file` - The file`WriterTo(stream: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`

### Parameters

`stream` - The output`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`output` - The input

`charset` - The charset`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, encoder: `[`CharsetEncoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetEncoder.html)`)`

### Parameters

`output` - The input

`encoder` - Charset encoder

**Since**
0.13.1

`WriterTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`>)`

A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

