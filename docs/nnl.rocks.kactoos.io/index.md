[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.io](.)

## Package nnl.rocks.kactoos.io

Input/Output.

### Types

| Name | Summary |
|---|---|
| [BytesOf](-bytes-of/index.md) | `class BytesOf : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>A [Bytes](../nnl.rocks.kactoos/-bytes/index.md) that encapsulates other sources of data. |
| [DeadInput](-dead-input/index.md) | `class DeadInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input with no data. |
| [DeadInputStream](-dead-input-stream/index.md) | `class DeadInputStream : InputStream`<br>InputStream with no data. |
| [DeadOutput](-dead-output/index.md) | `class DeadOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that accepts anything. |
| [DeadOutputStream](-dead-output-stream/index.md) | `class DeadOutputStream : OutputStream`<br>OutputStream that accepts anything. |
| [Directory](-directory/index.md) | `class Directory : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<Path>`<br>Files in a directory. |
| [EmptyBytes](-empty-bytes/index.md) | `class EmptyBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Bytes with no data. |
| [InputOf](-input-of/index.md) | `class InputOf : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>An [Input](../nnl.rocks.kactoos/-input/index.md) that encapsulates other sources of data. |
| [InputStreamOf](-input-stream-of/index.md) | `class InputStreamOf : InputStream`<br>An [InputStream](#) that encapsulates other sources of data. |
| [InputWithFallback](-input-with-fallback/index.md) | `class InputWithFallback : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that returns an alternative input if the main one throws [IOException](#). |
| [LSInputOf](-l-s-input-of/index.md) | `class LSInputOf : LSInput`<br>Input as LSInput. |
| [LengthOf](-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.md)<br>Length of [Input](../nnl.rocks.kactoos/-input/index.md). |
| [OutputStreamTo](-output-stream-to/index.md) | `class OutputStreamTo : OutputStream`<br>An [OutputStream](#) that encapsulates other destination for the data. |
| [OutputTo](-output-to/index.md) | `class OutputTo : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>An [Output](../nnl.rocks.kactoos/-output/index.md) that encapsulates other destination for the data. |
| [ReaderOf](-reader-of/index.md) | `class ReaderOf : Reader`<br>A [Reader](#) that encapsulates other sources of data. |
| [ResourceOf](-resource-of/index.md) | `class ResourceOf : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Classpath resource. |
| [StderrOutput](-stderr-output/index.md) | `class StderrOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that writes to `stderr`. |
| [StdinInput](-stdin-input/index.md) | `class StdinInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that reads from `stdin`. |
| [StdoutOutput](-stdout-output/index.md) | `class StdoutOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output that writes to `stdout`. |
| [StickyInput](-sticky-input/index.md) | `class StickyInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that reads only once. |
| [SyncInput](-sync-input/index.md) | `class SyncInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Thread-safe [Input](../nnl.rocks.kactoos/-input/index.md). |
| [SyncOutput](-sync-output/index.md) | `class SyncOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Thread-safe [Output](../nnl.rocks.kactoos/-output/index.md). |
| [TeeInput](-tee-input/index.md) | `class TeeInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input to Output copying pipe. |
| [TeeInputStream](-tee-input-stream/index.md) | `class TeeInputStream : InputStream`<br>Stream that copies input to output. |
| [TeeOutput](-tee-output/index.md) | `class TeeOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Output to Output copying pipe. |
| [TeeOutputStream](-tee-output-stream/index.md) | `class TeeOutputStream : OutputStream`<br>Stream that copies output to output. |
| [TeeReader](-tee-reader/index.md) | `class TeeReader : Reader`<br>Input to Output copying reader. |
| [UncheckedBytes](-unchecked-bytes/index.md) | `class UncheckedBytes : `[`Bytes`](../nnl.rocks.kactoos/-bytes/index.md)<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UncheckedInput](-unchecked-input/index.md) | `class UncheckedInput : `[`Input`](../nnl.rocks.kactoos/-input/index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [UncheckedOutput](-unchecked-output/index.md) | `class UncheckedOutput : `[`Output`](../nnl.rocks.kactoos/-output/index.md)<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
| [WriterTo](-writer-to/index.md) | `class WriterTo : Writer`<br>A [Writer](#) that encapsulates other destination for the data. |
