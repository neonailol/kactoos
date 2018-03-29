[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [LoggingOutput](./index.md)

# LoggingOutput

`class LoggingOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md)

Logged output.

There is no thread-safety guarantee.

### Parameters

`origin` - Data output

`destination` - The name of destination data

`logger` - Message logger

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LoggingOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, destination: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, logger: `[`Logger`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html)` = Logger.getLogger(destination))`<br>Logged output. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |
