---
title: OutputStreamTo.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [OutputStreamTo](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`OutputStreamTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`>)`
`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)``OutputStreamTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

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

`OutputStreamTo(wtr: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
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

`OutputStreamTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)`

### Parameters

`output` - The input`OutputStreamTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`>)`

An [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

