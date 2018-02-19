---
title: GzipInput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [GzipInput](./index.html)

# GzipInput

`class GzipInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/GzipInput.kt#L15)

Input that reads compressed data from the GZIP file format.

### Parameters

`origin` - The input

`size` - Max length of the buffer

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `GzipInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)``GzipInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Input that reads compressed data from the GZIP file format. |

### Functions

| [stream](stream.html) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

