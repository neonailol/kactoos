[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [OutputStreamTo](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`OutputStreamTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<OutputStream>)`
`OutputStreamTo(wtr: Writer)``OutputStreamTo(path: Path)`

### Parameters

`path` - The path`OutputStreamTo(file: File)`

### Parameters

`file` - The file`OutputStreamTo(wtr: Writer, charset: Charset)`
`OutputStreamTo(wtr: Writer, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`wtr` - Writer

`charset` - Charset

**Since**
0.13.1

`OutputStreamTo(wtr: Writer, charset: Charset, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`OutputStreamTo(wtr: Writer, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`wtr` - Reader

`charset` - Charset

`size` - Buffer size

**Since**
0.13.1

`OutputStreamTo(wtr: Writer, ddr: CharsetDecoder, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`wtr` - Reader

`ddr` - Charset decoder

`size` - Buffer size

**Since**
0.13.1

`OutputStreamTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`output` - The input`OutputStreamTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<OutputStream>)`

An [OutputStream](#) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

