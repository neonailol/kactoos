[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [GzipInput](./index.md)

# GzipInput

`class GzipInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/GzipInput.kt#L15)

Input that reads compressed data from the GZIP file format.

### Parameters

`origin` - The input

`size` - Max length of the buffer

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `GzipInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`<br>Input that reads compressed data from the GZIP file format. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
