---
title: StickyInput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [StickyInput](./index.html)

# StickyInput

`class StickyInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/StickyInput.kt#L27)

Input that reads only once.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncInput](../-sync-input/index.html).

There is no thread-safety guarantee.

**Since**
0.6

### Constructors

| [&lt;init&gt;](-init-.html) | `StickyInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)``StickyInput(cache: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>)`<br>Input that reads only once. |

### Functions

| [stream](stream.html) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

