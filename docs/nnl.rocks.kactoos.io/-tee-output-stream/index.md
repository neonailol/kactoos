---
title: TeeOutputStream - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [TeeOutputStream](./index.html)

# TeeOutputStream

`class TeeOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TeeOutputStream.kt#L16)

Stream that copies output to output.

There is no thread-safety guarantee.

**Since**
0.16

### Constructors

| [&lt;init&gt;](-init-.html) | `TeeOutputStream(target: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`, copy: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`)`<br>Stream that copies output to output. |

### Functions

| [close](close.html) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [flush](flush.html) | `fun flush(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.html) | `fun write(data: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buf: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buf: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

