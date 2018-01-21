[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [WriterTo](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`WriterTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<Writer>)``WriterTo(path: Path)`

### Parameters

`path` - The path`WriterTo(file: File)`

### Parameters

`file` - The file`WriterTo(stream: OutputStream)`

### Parameters

`stream` - The output`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset = StandardCharsets.UTF_8)`
`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`output` - The input

`charset` - The charset`WriterTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, encoder: CharsetEncoder)`

### Parameters

`output` - The input

`encoder` - Charset encoder

**Since**
0.13.1

`WriterTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<Writer>)`

A [Writer](#) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

