[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeOutput](.)

# TeeOutput

`class TeeOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TeeOutput.kt#L22)

Output to Output copying pipe.

There is no thread-safety guarantee.

**Since**
0.16

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: Writer, charset: Charset)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: Writer)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: Path)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: File)`<br>`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: OutputStream)``TeeOutput(target: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, copy: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`<br>Output to Output copying pipe. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): OutputStream`<br>Get write access to it. |
