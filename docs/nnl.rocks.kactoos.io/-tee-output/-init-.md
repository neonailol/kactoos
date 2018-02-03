[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeOutput](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`

### Parameters

`tgt` - The target

`cpy` - The copy destination

`charset` - The charset`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`
`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`
`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`
`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`

### Parameters

`tgt` - The target

`cpy` - The copy destination`TeeOutput(target: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, copy: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

Output to Output copying pipe.

There is no thread-safety guarantee.

**Since**
0.16

