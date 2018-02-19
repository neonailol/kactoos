---
title: SyncOutput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [SyncOutput](./index.html)

# SyncOutput

`class SyncOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/SyncOutput.kt#L18)

Thread-safe [Output](../../nnl.rocks.kactoos/-output/index.html).

There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)``SyncOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Thread-safe [Output](../../nnl.rocks.kactoos/-output/index.html). |

### Functions

| [stream](stream.html) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

