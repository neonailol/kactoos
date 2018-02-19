---
title: Input - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos](../index.html) / [Input](./index.html)

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

Here [nnl.rocks.kactoos.io.InputOf](../../nnl.rocks.kactoos.io/-input-of/index.html) implements
[Input](./index.md) and behaves like
one, providing read-only access to
the encapsulated [java.io.File](http://docs.oracle.com/javase/8/docs/api/java/io/File.html).

There is no thread-safety guarantee.

**See Also**

[nnl.rocks.kactoos.io.InputOf](../../nnl.rocks.kactoos.io/-input-of/index.html)

**Since**
0.1

### Types

| [NoNulls](-no-nulls/index.html) | `class NoNulls : `[`Input`](./index.md) |

### Functions

| [stream](stream.html) | `abstract fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

### Inheritors

| [DeadInput](../../nnl.rocks.kactoos.io/-dead-input/index.html) | `class DeadInput : `[`Input`](./index.md)<br>Input with no data. |
| [GzipInput](../../nnl.rocks.kactoos.io/-gzip-input/index.html) | `class GzipInput : `[`Input`](./index.md)<br>Input that reads compressed data from the GZIP file format. |
| [InputOf](../../nnl.rocks.kactoos.io/-input-of/index.html) | `class InputOf : `[`Input`](./index.md)<br>An [Input](./index.md) that encapsulates other sources of data. |
| [InputWithFallback](../../nnl.rocks.kactoos.io/-input-with-fallback/index.html) | `class InputWithFallback : `[`Input`](./index.md)<br>Input that returns an alternative input if the main one throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html). |
| [LoggingInput](../../nnl.rocks.kactoos.io/-logging-input/index.html) | `class LoggingInput : `[`Input`](./index.md)<br>Logged input. |
| [NoNulls](-no-nulls/index.html) | `class NoNulls : `[`Input`](./index.md) |
| [ResourceOf](../../nnl.rocks.kactoos.io/-resource-of/index.html) | `class ResourceOf : `[`Input`](./index.md)<br>Classpath resource. |
| [StdinInput](../../nnl.rocks.kactoos.io/-stdin-input/index.html) | `class StdinInput : `[`Input`](./index.md)<br>Input that reads from `stdin`. |
| [StickyInput](../../nnl.rocks.kactoos.io/-sticky-input/index.html) | `class StickyInput : `[`Input`](./index.md)<br>Input that reads only once. |
| [SyncInput](../../nnl.rocks.kactoos.io/-sync-input/index.html) | `class SyncInput : `[`Input`](./index.md)<br>Thread-safe [Input](./index.md). |
| [TeeInput](../../nnl.rocks.kactoos.io/-tee-input/index.html) | `class TeeInput : `[`Input`](./index.md)<br>Input to Output copying pipe. |
| [UncheckedInput](../../nnl.rocks.kactoos.io/-unchecked-input/index.html) | `class UncheckedInput : `[`Input`](./index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

