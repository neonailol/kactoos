---
title: LoggingOutputStream - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [LoggingOutputStream](./index.html)

# LoggingOutputStream

`class LoggingOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/LoggingOutputStream.kt#L21)

Logged output stream.

There is no thread-safety guarantee.

### Parameters

`origin` - Destination of data

`destination` - The name of source data

`logger` - Message logger

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `LoggingOutputStream(origin: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`, destination: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, logger: `[`Logger`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html)` = Logger.getLogger(destination))`<br>Logged output stream. |

### Functions

| [close](close.html) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [flush](flush.html) | `fun flush(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.html) | `fun write(data: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buf: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buf: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

