[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [ReaderOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`ReaderOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

### Parameters

`chars` - Chars`ReaderOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: Charset)`

### Parameters

`chars` - Chars

`charset` - Charset`ReaderOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`chars` - Chars

`charset` - Charset`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`

### Parameters

`bytes` - Bytes`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, charset: Charset)`
`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`bytes` - Bytes

`charset` - Charset`ReaderOf(path: Path)`

### Parameters

`path` - The path`ReaderOf(file: File)`

### Parameters

`file` - The file`ReaderOf(url: URL)`

### Parameters

`url` - The URL`ReaderOf(uri: URI)`

### Parameters

`uri` - The URI`ReaderOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`

### Parameters

`bytes` - The text`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`
`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`
`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`
`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text

`charset` - Charset`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, charset: Charset = StandardCharsets.UTF_8)`
`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The input

`charset` - The charset`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, decoder: CharsetDecoder)`

### Parameters

`input` - The input

`decoder` - The decoder

**Since**
0.13.1

`ReaderOf(stream: InputStream, charset: Charset = StandardCharsets.UTF_8)`

### Parameters

`stream` - The stream

`charset` - The charset`ReaderOf(stream: InputStream, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`stream` - The stream

`charset` - The charset

### Exceptions

`UnsupportedEncodingException` - If fails`ReaderOf(stream: InputStream, decoder: CharsetDecoder)`

### Parameters

`stream` - The stream

`decoder` - The charset decoder

**Since**
0.13.1

`ReaderOf(source: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<Reader>)`

A [Reader](#) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.13

