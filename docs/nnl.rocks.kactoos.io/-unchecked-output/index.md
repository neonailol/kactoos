---
title: UncheckedOutput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [UncheckedOutput](./index.html)

# UncheckedOutput

`class UncheckedOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/UncheckedOutput.kt#L18)

Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

**Since**
0.9

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedOutput(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`)`<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [stream](stream.html) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

