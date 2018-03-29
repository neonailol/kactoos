[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [SyncOutput](./index.md)

# SyncOutput

`class SyncOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md)

Thread-safe [Output](../../nnl.rocks.kactoos/-output/index.md).

There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)``SyncOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Thread-safe [Output](../../nnl.rocks.kactoos/-output/index.md). |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |
