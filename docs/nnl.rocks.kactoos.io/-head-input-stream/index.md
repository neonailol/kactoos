[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [HeadInputStream](./index.md)

# HeadInputStream

`class HeadInputStream : `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)

Input stream that only shows the first N bytes of the original stream.

There is no thread-safety guarantee.

### Parameters

`origin` - The original input stream.

`len` - A number of bytes that can be read from the beginning.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `HeadInputStream(origin: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`, length: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`<br>Input stream that only shows the first N bytes of the original stream. |

### Functions

| Name | Summary |
|---|---|
| [available](available.md) | `fun available(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [mark](mark.md) | `fun mark(readlimit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [markSupported](mark-supported.md) | `fun markSupported(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [read](read.md) | `fun read(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [reset](reset.md) | `fun reset(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [skip](skip.md) | `fun skip(skip: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
