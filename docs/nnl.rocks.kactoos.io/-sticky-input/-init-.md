[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [StickyInput](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`StickyInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)``StickyInput(cache: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>)`

Input that reads only once.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncInput](../-sync-input/index.md).

There is no thread-safety guarantee.

**Since**
0.6

