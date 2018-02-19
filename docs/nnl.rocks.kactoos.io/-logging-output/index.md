---
title: LoggingOutput - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [LoggingOutput](./index.html)

# LoggingOutput

`class LoggingOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/LoggingOutput.kt#L19)

Logged output.

There is no thread-safety guarantee.

### Parameters

`origin` - Data output

`destination` - The name of destination data

`logger` - Message logger

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `LoggingOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.html)`, destination: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, logger: `[`Logger`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html)` = Logger.getLogger(destination))`<br>Logged output. |

### Functions

| [stream](stream.html) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

