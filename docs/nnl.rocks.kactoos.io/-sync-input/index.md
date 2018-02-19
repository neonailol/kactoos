---
title: SyncInput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [SyncInput](./index.html)

# SyncInput

`class SyncInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/SyncInput.kt#L15)

Thread-safe [Input](../../nnl.rocks.kactoos/-input/index.html).

There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)``SyncInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Thread-safe [Input](../../nnl.rocks.kactoos/-input/index.html). |

### Functions

| [stream](stream.html) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

