[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [GzipOutput](./index.md)

# GzipOutput

`class GzipOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/GzipOutput.kt#L15)

Output that writes compressed data in the GZIP file format.

### Parameters

`origin` - The output

`size` - Max length of the buffer

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `GzipOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`<br>Output that writes compressed data in the GZIP file format. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |