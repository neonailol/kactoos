[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeReader](.)

# TeeReader

`class TeeReader : Reader` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/TeeReader.kt#L16)

Input to Output copying reader.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeeReader(source: Reader, destination: Writer)`<br>Input to Output copying reader. |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [read](read.md) | `fun read(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
