[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.io](./index.md)

## Package nnl.rocks.kactoos.io

Input/Output.

### Types

| Name | Summary |
|---|---|
| [BytesOf](-bytes-of/index.md) | `class BytesOf : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>A [Bytes](../nnl.rocks.kactoos/-bytes/index.md) that encapsulates other sources of data. |
| [CheckedBytes](-checked-bytes/index.md) | `class CheckedBytes<E> : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Bytes that throws exception of specified type. |
| [CheckedInput](-checked-input/index.md) | `class CheckedInput<E> : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that throws exception of specified type. |
| [CheckedOutput](-checked-output/index.md) | `class CheckedOutput<E> : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that throws exception of specified type. |
| [DeadInput](-dead-input/index.md) | `class DeadInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input with no data. |
| [DeadInputStream](-dead-input-stream/index.md) | `class DeadInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>InputStream with no data. |
| [DeadOutput](-dead-output/index.md) | `class DeadOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that accepts anything. |
| [DeadOutputStream](-dead-output-stream/index.md) | `class DeadOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>OutputStream that accepts anything. |
| [DigestEnvelope](-digest-envelope/index.md) | `abstract class DigestEnvelope : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Digest Envelope. |
| [Directory](-directory/index.md) | `class Directory : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>`<br>Files in a directory. |
| [EmptyBytes](-empty-bytes/index.md) | `class EmptyBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Bytes with no data. |
| [GzipInput](-gzip-input/index.md) | `class GzipInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that reads compressed data from the GZIP file format. |
| [GzipOutput](-gzip-output/index.md) | `class GzipOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that writes compressed data in the GZIP file format. |
| [HeadInput](-head-input/index.md) | `class HeadInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that only shows the first N bytes of the original input. |
| [HeadInputStream](-head-input-stream/index.md) | `class HeadInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Input stream that only shows the first N bytes of the original stream. |
| [InputOf](-input-of/index.md) | `class InputOf : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>An [Input](../nnl.rocks.kactoos/-input/index.md) that encapsulates other sources of data. |
| [InputStreamOf](-input-stream-of/index.md) | `class InputStreamOf : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>An [InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) that encapsulates other sources of data. |
| [InputWithFallback](-input-with-fallback/index.md) | `class InputWithFallback : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that returns an alternative input if the main one throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html). |
| [LSInputOf](-l-s-input-of/index.md) | `class LSInputOf : `[`LSInput`](http://docs.oracle.com/javase/8/docs/api/org/w3c/dom/ls/LSInput.html)<br>Input as LSInput. |
| [LengthOf](-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.md)<br>Length of [Input](../nnl.rocks.kactoos/-input/index.md). |
| [LoggingInput](-logging-input/index.md) | `class LoggingInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Logged input. |
| [LoggingInputStream](-logging-input-stream/index.md) | `class LoggingInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Logged input stream. |
| [LoggingOutput](-logging-output/index.md) | `class LoggingOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Logged output. |
| [LoggingOutputStream](-logging-output-stream/index.md) | `class LoggingOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Logged output stream. |
| [Md5DigestOf](-md5-digest-of/index.md) | `class Md5DigestOf : `[`DigestEnvelope`](-digest-envelope/index.md)<br>MD5 checksum calculation of [Input](../nnl.rocks.kactoos/-input/index.md). |
| [OutputStreamTo](-output-stream-to/index.md) | `class OutputStreamTo : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>An [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) that encapsulates other destination for the data. |
| [OutputTo](-output-to/index.md) | `class OutputTo : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>An [Output](../nnl.rocks.kactoos/-output/index.md) that encapsulates other destination for the data. |
| [ReaderAsBytes](-reader-as-bytes/index.md) | `class ReaderAsBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Reader as [Bytes](../nnl.rocks.kactoos/-bytes/index.md). |
| [ReaderOf](-reader-of/index.md) | `class ReaderOf : `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)<br>A [Reader](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html) that encapsulates other sources of data. |
| [ResourceOf](-resource-of/index.md) | `class ResourceOf : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Classpath resource. |
| [Sha1DigestOf](-sha1-digest-of/index.md) | `class Sha1DigestOf : `[`DigestEnvelope`](-digest-envelope/index.md)<br>SHA-1 checksum calculation of [Input](../nnl.rocks.kactoos/-input/index.md). |
| [Sha256DigestOf](-sha256-digest-of/index.md) | `class Sha256DigestOf : `[`DigestEnvelope`](-digest-envelope/index.md)<br>SHA-256 checksum calculation of [Input](../nnl.rocks.kactoos/-input/index.md). |
| [StderrOutput](-stderr-output/index.md) | `class StderrOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that writes to `stderr`. |
| [StdinInput](-stdin-input/index.md) | `class StdinInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that reads from `stdin`. |
| [StdoutOutput](-stdout-output/index.md) | `class StdoutOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that writes to `stdout`. |
| [StickyInput](-sticky-input/index.md) | `class StickyInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that reads only once. |
| [SyncInput](-sync-input/index.md) | `class SyncInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Thread-safe [Input](../nnl.rocks.kactoos/-input/index.md). |
| [SyncOutput](-sync-output/index.md) | `class SyncOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Thread-safe [Output](../nnl.rocks.kactoos/-output/index.md). |
| [TailInput](-tail-input/index.md) | `class TailInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input showing only last N bytes of the stream. |
| [TeeInput](-tee-input/index.md) | `class TeeInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input to Output copying pipe. |
| [TeeInputStream](-tee-input-stream/index.md) | `class TeeInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Stream that copies input to output. |
| [TeeOutput](-tee-output/index.md) | `class TeeOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output to Output copying pipe. |
| [TeeOutputStream](-tee-output-stream/index.md) | `class TeeOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Stream that copies output to output. |
| [TeeReader](-tee-reader/index.md) | `class TeeReader : `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)<br>Input to Output copying reader. |
| [TempFile](-temp-file/index.md) | `class TempFile : `[`Scalar`](../nnl.rocks.kactoos/-scalar/index.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, `[`Closeable`](http://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)<br>A temporary file. |
| [UncheckedBytes](-unchecked-bytes/index.md) | `class UncheckedBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UncheckedInput](-unchecked-input/index.md) | `class UncheckedInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UncheckedOutput](-unchecked-output/index.md) | `class UncheckedOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [WriterAsOutputStream](-writer-as-output-stream/index.md) | `class WriterAsOutputStream : `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Writer as [OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html). |
| [WriterTo](-writer-to/index.md) | `class WriterTo : `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)<br>A [Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) that encapsulates other destination for the data. |
| [Zip](-zip/index.md) | `class Zip : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Zip files and directory. |
