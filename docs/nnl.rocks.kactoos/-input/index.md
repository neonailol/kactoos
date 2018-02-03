[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Input](./index.md)

# Input

`@FunctionalInterface interface Input` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Input.kt#L29)

Input.

Here is for example how [Input](./index.md) can be used
in order to read the content of a text file:

```
String content = new TextOf(
  new InputOf(new File("/tmp/names.txt"))
).asString();
```

Here [nnl.rocks.kactoos.io.InputOf](../../nnl.rocks.kactoos.io/-input-of/index.md) implements
[Input](./index.md) and behaves like
one, providing read-only access to
the encapsulated [java.io.File](http://docs.oracle.com/javase/8/docs/api/java/io/File.html).

There is no thread-safety guarantee.

**See Also**

[nnl.rocks.kactoos.io.InputOf](../../nnl.rocks.kactoos.io/-input-of/index.md)

**Since**
0.1

### Types

| Name | Summary |
|---|---|
| [NoNulls](-no-nulls/index.md) | `class NoNulls : `[`Input`](./index.md) |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `abstract fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

### Inheritors

| Name | Summary |
|---|---|
| [DeadInput](../../nnl.rocks.kactoos.io/-dead-input/index.md) | `class DeadInput : `[`Input`](./index.md)<br>Input with no data. |
| [InputOf](../../nnl.rocks.kactoos.io/-input-of/index.md) | `class InputOf : `[`Input`](./index.md)<br>An [Input](./index.md) that encapsulates other sources of data. |
| [InputWithFallback](../../nnl.rocks.kactoos.io/-input-with-fallback/index.md) | `class InputWithFallback : `[`Input`](./index.md)<br>Input that returns an alternative input if the main one throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html). |
| [LoggingInput](../../nnl.rocks.kactoos.io/-logging-input/index.md) | `class LoggingInput : `[`Input`](./index.md)<br>Logged input. |
| [NoNulls](-no-nulls/index.md) | `class NoNulls : `[`Input`](./index.md) |
| [ResourceOf](../../nnl.rocks.kactoos.io/-resource-of/index.md) | `class ResourceOf : `[`Input`](./index.md)<br>Classpath resource. |
| [StdinInput](../../nnl.rocks.kactoos.io/-stdin-input/index.md) | `class StdinInput : `[`Input`](./index.md)<br>Input that reads from `stdin`. |
| [StickyInput](../../nnl.rocks.kactoos.io/-sticky-input/index.md) | `class StickyInput : `[`Input`](./index.md)<br>Input that reads only once. |
| [SyncInput](../../nnl.rocks.kactoos.io/-sync-input/index.md) | `class SyncInput : `[`Input`](./index.md)<br>Thread-safe [Input](./index.md). |
| [TeeInput](../../nnl.rocks.kactoos.io/-tee-input/index.md) | `class TeeInput : `[`Input`](./index.md)<br>Input to Output copying pipe. |
| [UncheckedInput](../../nnl.rocks.kactoos.io/-unchecked-input/index.md) | `class UncheckedInput : `[`Input`](./index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
