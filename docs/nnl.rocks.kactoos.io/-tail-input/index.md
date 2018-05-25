[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TailInput](./index.md)

# TailInput

`class TailInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md)

Input showing only last N bytes of the stream.

There is no thread-safety guarantee.

### Parameters

`input` - Input to decorate

`count` - Number of last bytes to show from input

`max` - Maximum number of bytes to read at once

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TailInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, count: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16384)`<br>Input showing only last N bytes of the stream. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
