[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [StickyInput](./index.md)

# StickyInput

`class StickyInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md)

Input that reads only once.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncInput](../-sync-input/index.md).

There is no thread-safety guarantee.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)` |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
