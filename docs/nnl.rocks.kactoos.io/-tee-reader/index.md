---
title: TeeReader - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [TeeReader](./index.html)

# TeeReader

`class TeeReader : `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TeeReader.kt#L16)

Input to Output copying reader.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| [&lt;init&gt;](-init-.html) | `TeeReader(source: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, destination: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`<br>Input to Output copying reader. |

### Functions

| [close](close.html) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [read](read.html) | `fun read(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

