---
title: OutputTo.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [OutputTo](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`OutputTo(out: KOutput)`

### Parameters

`out` - KOutput

**Since**
0.15

`OutputTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`

### Parameters

`file` - The file

`mkdirs` - Should we do mkdirs beforehand?

**Since**
0.15

`OutputTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`
`OutputTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)``OutputTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`

Ctor.

### Parameters

`path` - The path

`mkdirs` - Should we do mkdirs beforehand?

**Since**
0.15

`OutputTo(writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`

Ctor.

### Parameters

`writer` - The writer`OutputTo(stream: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`

Ctor.

### Parameters

`stream` - The stream`OutputTo(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)`

An [Output](../../nnl.rocks.kactoos/-output/index.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.12

