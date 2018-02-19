---
title: StickyInput.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [StickyInput](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`StickyInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)``StickyInput(cache: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>)`

Input that reads only once.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncInput](../-sync-input/index.html).

There is no thread-safety guarantee.

**Since**
0.6

