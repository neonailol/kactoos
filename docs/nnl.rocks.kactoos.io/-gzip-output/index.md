---
title: GzipOutput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [GzipOutput](./index.html)

# GzipOutput

`class GzipOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/GzipOutput.kt#L15)

Output that writes compressed data in the GZIP file format.

### Parameters

`origin` - The output

`size` - Max length of the buffer

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `GzipOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)``GzipOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Output that writes compressed data in the GZIP file format. |

### Functions

| [stream](stream.html) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

