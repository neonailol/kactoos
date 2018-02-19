[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeOutput](./index.md)

# TeeOutput

`class TeeOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TeeOutput.kt#L22)

Output to Output copying pipe.

There is no thread-safety guarantee.

**Since**
0.16

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)``TeeOutput(target: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, copy: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`<br>Output to Output copying pipe. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |
