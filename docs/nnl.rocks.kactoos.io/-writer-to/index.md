[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterTo](.)

# WriterTo

`class WriterTo : Writer` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/WriterTo.kt#L28)

A [Writer](#) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `WriterTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<Writer>)`<br>`WriterTo(path: Path)`<br>`WriterTo(file: File)`<br>`WriterTo(stream: OutputStream)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset = StandardCharsets.UTF_8)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, encoder: CharsetEncoder)``WriterTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<Writer>)`<br>A [Writer](#) that encapsulates other destination for the data. |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [flush](flush.md) | `fun flush(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.md) | `fun write(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, off: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
