---
title: LoggingOutputStream.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [LoggingOutputStream](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`LoggingOutputStream(origin: `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)`, destination: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, logger: `[`Logger`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html)` = Logger.getLogger(destination))`

Logged output stream.

There is no thread-safety guarantee.

### Parameters

`origin` - Destination of data

`destination` - The name of source data

`logger` - Message logger

**Since**
0.3

