[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [OutputTo](.)

# OutputTo

`class OutputTo : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/OutputTo.kt#L21)

An [Output](../../nnl.rocks.kactoos/-output/index.md) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OutputTo(out: KOutput)`<br>`OutputTo(file: File, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>`OutputTo(file: File)`<br>`OutputTo(path: Path)``OutputTo(path: Path, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>`OutputTo(writer: Writer)`<br>`OutputTo(stream: OutputStream)`<br>Ctor.`OutputTo(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`<br>An [Output](../../nnl.rocks.kactoos/-output/index.md) that encapsulates other destination for the data. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): OutputStream`<br>Get write access to it. |
