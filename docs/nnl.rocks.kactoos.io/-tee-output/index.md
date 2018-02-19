---
title: TeeOutput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [TeeOutput](./index.html)

# TeeOutput

`class TeeOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TeeOutput.kt#L22)

Output to Output copying pipe.

There is no thread-safety guarantee.

**Since**
0.16

### Constructors

| [&lt;init&gt;](-init-.html) | `TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, cpy: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, cpy: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, cpy: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, cpy: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, cpy: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)``TeeOutput(target: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, copy: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)`<br>Output to Output copying pipe. |

### Functions

| [stream](stream.html) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

