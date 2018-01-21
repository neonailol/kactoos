[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Output](.)

# Output

`@FunctionalInterface interface Output` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Output.kt#L37)

Output.

Here is for example how Output can be used
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

Here [OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.md) implements Output and behaves like
one, providing write-only access to the encapsulated
[java.io.File](#). The [TeeInput](../../nnl.rocks.kactoos.io/-tee-input/index.md) copies the content of the
input to the output. The [nnl.rocks.kactoos.io.LengthOf](../../nnl.rocks.kactoos.io/-length-of/index.md)
calculates the size of the copied data.

There is no thread-safety guarantee.

**See Also**

[OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.md)

**Since**
0.1

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `abstract fun stream(): OutputStream`<br>Get write access to it. |

### Inheritors

| Name | Summary |
|---|---|
| [DeadOutput](../../nnl.rocks.kactoos.io/-dead-output/index.md) | `class DeadOutput : Output`<br>Output that accepts anything. |
| [OutputTo](../../nnl.rocks.kactoos.io/-output-to/index.md) | `class OutputTo : Output`<br>An Output that encapsulates other destination for the data. |
| [StderrOutput](../../nnl.rocks.kactoos.io/-stderr-output/index.md) | `class StderrOutput : Output`<br>Output that writes to `stderr`. |
| [StdoutOutput](../../nnl.rocks.kactoos.io/-stdout-output/index.md) | `class StdoutOutput : Output`<br>Output that writes to `stdout`. |
| [SyncOutput](../../nnl.rocks.kactoos.io/-sync-output/index.md) | `class SyncOutput : Output`<br>Thread-safe Output. |
| [TeeOutput](../../nnl.rocks.kactoos.io/-tee-output/index.md) | `class TeeOutput : Output`<br>Output to Output copying pipe. |
| [UncheckedOutput](../../nnl.rocks.kactoos.io/-unchecked-output/index.md) | `class UncheckedOutput : Output`<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
