[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Output](./index.md)

# Output

`@FunctionalInterface interface Output`

Output.

Here is for example how [Output](./index.md) can be used
together with [Input](../-input/index.md) in order to modify the content
of a text file:

```
new LengthOf(
  new TeeInput(
    new InputOf(new TextOf("Hello, world!")),
    new OutputTo(new File("/tmp/names.txt"))
  )
).asValue();
```

Here [OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.md) implements [Output](./index.md) and behaves like
one, providing write-only access to the encapsulated
[java.io.File](http://docs.oracle.com/javase/8/docs/api/java/io/File.html). The [TeeInput](../../nnl.rocks.kactoos.io/-tee-input/index.md) copies the content of the
input to the output. The [nnl.rocks.kactoos.io.LengthOf](../../nnl.rocks.kactoos.io/-length-of/index.md)
calculates the size of the copied data.

There is no thread-safety guarantee.

**See Also**

[OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.md)

**Since**
0.1

### Types

| Name | Summary |
|---|---|
| [NoNulls](-no-nulls/index.md) | `class NoNulls : `[`Output`](./index.md) |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `abstract fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

### Inheritors

| Name | Summary |
|---|---|
| [DeadOutput](../../nnl.rocks.kactoos.io/-dead-output/index.md) | `class DeadOutput : `[`Output`](./index.md)<br>Output that accepts anything. |
| [GzipOutput](../../nnl.rocks.kactoos.io/-gzip-output/index.md) | `class GzipOutput : `[`Output`](./index.md)<br>Output that writes compressed data in the GZIP file format. |
| [LoggingOutput](../../nnl.rocks.kactoos.io/-logging-output/index.md) | `class LoggingOutput : `[`Output`](./index.md)<br>Logged output. |
| [NoNulls](-no-nulls/index.md) | `class NoNulls : `[`Output`](./index.md) |
| [OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.md) | `class OutputTo : `[`Output`](./index.md)<br>An [Output](./index.md) that encapsulates other destination for the data. |
| [StderrOutput](../../nnl.rocks.kactoos.io/-stderr-output/index.md) | `class StderrOutput : `[`Output`](./index.md)<br>Output that writes to `stderr`. |
| [StdoutOutput](../../nnl.rocks.kactoos.io/-stdout-output/index.md) | `class StdoutOutput : `[`Output`](./index.md)<br>Output that writes to `stdout`. |
| [SyncOutput](../../nnl.rocks.kactoos.io/-sync-output/index.md) | `class SyncOutput : `[`Output`](./index.md)<br>Thread-safe [Output](./index.md). |
| [TeeOutput](../../nnl.rocks.kactoos.io/-tee-output/index.md) | `class TeeOutput : `[`Output`](./index.md)<br>Output to Output copying pipe. |
| [UncheckedOutput](../../nnl.rocks.kactoos.io/-unchecked-output/index.md) | `class UncheckedOutput : `[`Output`](./index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
