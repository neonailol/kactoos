[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [SyncInput](./index.md)

# SyncInput

`class SyncInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/SyncInput.kt#L15)

Thread-safe [Input](../../nnl.rocks.kactoos/-input/index.md).

There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)``SyncInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Thread-safe [Input](../../nnl.rocks.kactoos/-input/index.md). |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
