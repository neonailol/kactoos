[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeReader](./index.md)

# TeeReader

`class TeeReader : `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)

Input to Output copying reader.

There is no thread-safety guarantee.

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeeReader(source: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, destination: `[`Writer`](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)`)`<br>Input to Output copying reader. |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [read](read.md) | `fun read(cbuf: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, offset: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, length: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
