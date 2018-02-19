---
title: nnl.rocks.kactoos.io - kactoos-jvm
---

[kactoos-jvm](../index.html) / [nnl.rocks.kactoos.io](./index.html)

## Package nnl.rocks.kactoos.io

Input/Output.

### Types

| [BytesOf](-bytes-of/index.html) | `class BytesOf : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.html)<br>A [Bytes](../nnl.rocks.kactoos/-bytes/index.html) that encapsulates other sources of data. |
| [DeadInput](-dead-input/index.html) | `class DeadInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input with no data. |
| [DeadInputStream](-dead-input-stream/index.html) | `class DeadInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>InputStream with no data. |
| [DeadOutput](-dead-output/index.html) | `class DeadOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Output that accepts anything. |
| [DeadOutputStream](-dead-output-stream/index.html) | `class DeadOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>OutputStream that accepts anything. |
| [DigestEnvelope](-digest-envelope/index.html) | `abstract class DigestEnvelope : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.html)<br>Digest Envelope. |
| [Directory](-directory/index.html) | `class Directory : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>`<br>Files in a directory. |
| [EmptyBytes](-empty-bytes/index.html) | `class EmptyBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.html)<br>Bytes with no data. |
| [GzipInput](-gzip-input/index.html) | `class GzipInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input that reads compressed data from the GZIP file format. |
| [GzipOutput](-gzip-output/index.html) | `class GzipOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Output that writes compressed data in the GZIP file format. |
| [InputOf](-input-of/index.html) | `class InputOf : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>An [Input](../nnl.rocks.kactoos/-input/index.html) that encapsulates other sources of data. |
| [InputStreamOf](-input-stream-of/index.html) | `class InputStreamOf : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>An [InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) that encapsulates other sources of data. |
| [InputWithFallback](-input-with-fallback/index.html) | `class InputWithFallback : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input that returns an alternative input if the main one throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html). |
| [LSInputOf](-l-s-input-of/index.html) | `class LSInputOf : `[`LSInput`](http://docs.oracle.com/javase/8/docs/api/org/w3c/dom/ls/LSInput.html)<br>Input as LSInput. |
| [LengthOf](-length-of/index.html) | `class LengthOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.html)<br>Length of [Input](../nnl.rocks.kactoos/-input/index.html). |
| [LoggingInput](-logging-input/index.html) | `class LoggingInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Logged input. |
| [LoggingInputStream](-logging-input-stream/index.html) | `class LoggingInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Logged input stream. |
| [LoggingOutput](-logging-output/index.html) | `class LoggingOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Logged output. |
| [LoggingOutputStream](-logging-output-stream/index.html) | `class LoggingOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Logged output stream. |
| [Md5DigestOf](-md5-digest-of/index.html) | `class Md5DigestOf : `[`DigestEnvelope`](-digest-envelope/index.html)<br>MD5 checksum calculation of [Input](../nnl.rocks.kactoos/-input/index.html). |
| [OutputStreamTo](-output-stream-to/index.html) | `class OutputStreamTo : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>An [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) that encapsulates other destination for the data. |
| [OutputTo](-output-to/index.html) | `class OutputTo : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>An [Output](../nnl.rocks.kactoos/-output/index.html) that encapsulates other destination for the data. |
| [ReaderAsBytes](-reader-as-bytes/index.html) | `class ReaderAsBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.html)<br>Reader as [Bytes](../nnl.rocks.kactoos/-bytes/index.html). |
| [ReaderOf](-reader-of/index.html) | `class ReaderOf : `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)<br>A [Reader](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html) that encapsulates other sources of data. |
| [ResourceOf](-resource-of/index.html) | `class ResourceOf : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Classpath resource. |
| [Sha1DigestOf](-sha1-digest-of/index.html) | `class Sha1DigestOf : `[`DigestEnvelope`](-digest-envelope/index.html)<br>SHA-1 checksum calculation of [Input](../nnl.rocks.kactoos/-input/index.html). |
| [Sha256DigestOf](-sha256-digest-of/index.html) | `class Sha256DigestOf : `[`DigestEnvelope`](-digest-envelope/index.html)<br>SHA-256 checksum calculation of [Input](../nnl.rocks.kactoos/-input/index.html). |
| [StderrOutput](-stderr-output/index.html) | `class StderrOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Output that writes to `stderr`. |
| [StdinInput](-stdin-input/index.html) | `class StdinInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input that reads from `stdin`. |
| [StdoutOutput](-stdout-output/index.html) | `class StdoutOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Output that writes to `stdout`. |
| [StickyInput](-sticky-input/index.html) | `class StickyInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input that reads only once. |
| [SyncInput](-sync-input/index.html) | `class SyncInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Thread-safe [Input](../nnl.rocks.kactoos/-input/index.html). |
| [SyncOutput](-sync-output/index.html) | `class SyncOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Thread-safe [Output](../nnl.rocks.kactoos/-output/index.html). |
| [TeeInput](-tee-input/index.html) | `class TeeInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input to Output copying pipe. |
| [TeeInputStream](-tee-input-stream/index.html) | `class TeeInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Stream that copies input to output. |
| [TeeOutput](-tee-output/index.html) | `class TeeOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Output to Output copying pipe. |
| [TeeOutputStream](-tee-output-stream/index.html) | `class TeeOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Stream that copies output to output. |
| [TeeReader](-tee-reader/index.html) | `class TeeReader : `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)<br>Input to Output copying reader. |
| [TempFile](-temp-file/index.html) | `class TempFile : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, `[`Closeable`](http://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)<br>A temporary file. |
| [UncheckedBytes](-unchecked-bytes/index.html) | `class UncheckedBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.html)<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UncheckedInput](-unchecked-input/index.html) | `class UncheckedInput : `[`Input`](../nnl.rocks.kactoos/-input/index.html)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UncheckedOutput](-unchecked-output/index.html) | `class UncheckedOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.html)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [WriterAsOutputStream](-writer-as-output-stream/index.html) | `class WriterAsOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Writer as [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html). |
| [WriterTo](-writer-to/index.html) | `class WriterTo : `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)<br>A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data. |

