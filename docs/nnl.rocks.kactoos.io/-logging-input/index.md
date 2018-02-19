[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [LoggingInput](./index.md)

# LoggingInput

`class LoggingInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/LoggingInput.kt#L19)

Logged input.

There is no thread-safety guarantee.

### Parameters

`origin` - Data input

`source` - The name of source data

`logger` - Message logger

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LoggingInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, source: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, logger: `[`Logger`](http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html)` = Logger.getLogger(source))`<br>Logged input. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
