---
title: OutputTo - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [OutputTo](./index.html)

# OutputTo

`class OutputTo : `[`Output`](../../nnl.rocks.kactoos/-output/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/OutputTo.kt#L21)

An [Output](../../nnl.rocks.kactoos/-output/index.html) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.12

### Constructors

| [&lt;init&gt;](-init-.html) | `OutputTo(out: KOutput)`<br>`OutputTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>`OutputTo(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`<br>`OutputTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)``OutputTo(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>`OutputTo(writer: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`<br>`OutputTo(stream: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`<br>Ctor.`OutputTo(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)`<br>An [Output](../../nnl.rocks.kactoos/-output/index.html) that encapsulates other destination for the data. |

### Functions

| [stream](stream.html) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

