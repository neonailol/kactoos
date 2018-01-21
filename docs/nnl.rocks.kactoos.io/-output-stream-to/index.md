[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [OutputStreamTo](.)

# OutputStreamTo

`class OutputStreamTo : OutputStream` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/OutputStreamTo.kt#L28)

An [OutputStream](#) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `OutputStreamTo(tgt: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<OutputStream>)`<br>`OutputStreamTo(path: Path)`<br>`OutputStreamTo(file: File)`<br>`OutputStreamTo(wtr: Writer, charset: Charset)`<br>`OutputStreamTo(wtr: Writer)`<br>`OutputStreamTo(wtr: Writer, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`OutputStreamTo(wtr: Writer, charset: Charset, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`OutputStreamTo(wtr: Writer, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`OutputStreamTo(wtr: Writer, ddr: CharsetDecoder, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`OutputStreamTo(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)``OutputStreamTo(target: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<OutputStream>)`<br>An [OutputStream](#) that encapsulates other destination for the data. |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [flush](flush.md) | `fun flush(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [write](write.md) | `fun write(data: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buffer: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun write(buffer: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
