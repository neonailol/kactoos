[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [HeadInput](./index.md)

# HeadInput

`class HeadInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md)

Input that only shows the first N bytes of the original input.

### Parameters

`origin` - The original input.

`length` - Limit of bytes that can be read from the beginning.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `HeadInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, length: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`<br>Input that only shows the first N bytes of the original input. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
