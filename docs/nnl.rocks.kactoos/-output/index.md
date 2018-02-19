---
title: Output - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos](../index.html) / [Output](./index.html)

# Output

`@FunctionalInterface interface Output` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Output.kt#L37)

Output.

Here is for example how [Output](./index.md) can be used
together with [Input](../-input/index.html) in order to modify the content
of a text file:

```
new LengthOf(
  new TeeInput(
    new InputOf(new TextOf("Hello, world!")),
    new OutputTo(new File("/tmp/names.txt"))
  )
).asValue();
```

Here [OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.html) implements [Output](./index.md) and behaves like
one, providing write-only access to the encapsulated
[java.io.File](http://docs.oracle.com/javase/8/docs/api/java/io/File.html). The [TeeInput](../../nnl.rocks.kactoos.io/-tee-input/index.html) copies the content of the
input to the output. The [nnl.rocks.kactoos.io.LengthOf](../../nnl.rocks.kactoos.io/-length-of/index.html)
calculates the size of the copied data.

There is no thread-safety guarantee.

**See Also**

[OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.html)

**Since**
0.1

### Types

| [NoNulls](-no-nulls/index.html) | `class NoNulls : `[`Output`](./index.md) |

### Functions

| [stream](stream.html) | `abstract fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |

### Inheritors

| [DeadOutput](../../nnl.rocks.kactoos.io/-dead-output/index.html) | `class DeadOutput : `[`Output`](./index.md)<br>Output that accepts anything. |
| [GzipOutput](../../nnl.rocks.kactoos.io/-gzip-output/index.html) | `class GzipOutput : `[`Output`](./index.md)<br>Output that writes compressed data in the GZIP file format. |
| [LoggingOutput](../../nnl.rocks.kactoos.io/-logging-output/index.html) | `class LoggingOutput : `[`Output`](./index.md)<br>Logged output. |
| [NoNulls](-no-nulls/index.html) | `class NoNulls : `[`Output`](./index.md) |
| [OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.html) | `class OutputTo : `[`Output`](./index.md)<br>An [Output](./index.md) that encapsulates other destination for the data. |
| [StderrOutput](../../nnl.rocks.kactoos.io/-stderr-output/index.html) | `class StderrOutput : `[`Output`](./index.md)<br>Output that writes to `stderr`. |
| [StdoutOutput](../../nnl.rocks.kactoos.io/-stdout-output/index.html) | `class StdoutOutput : `[`Output`](./index.md)<br>Output that writes to `stdout`. |
| [SyncOutput](../../nnl.rocks.kactoos.io/-sync-output/index.html) | `class SyncOutput : `[`Output`](./index.md)<br>Thread-safe [Output](./index.md). |
| [TeeOutput](../../nnl.rocks.kactoos.io/-tee-output/index.html) | `class TeeOutput : `[`Output`](./index.md)<br>Output to Output copying pipe. |
| [UncheckedOutput](../../nnl.rocks.kactoos.io/-unchecked-output/index.html) | `class UncheckedOutput : `[`Output`](./index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

