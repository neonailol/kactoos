---
title: LoggingInputStream.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [LoggingInputStream](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`LoggingInputStream(origin: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`, source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, logger: `[`Logger`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html)` = Logger.getLogger(source))`

Logged input stream.

There is no thread-safety guarantee.

### Parameters

`origin` - Source of data

`source` - The name of source data

`logger` - The message logger

**Since**
0.3

