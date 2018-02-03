[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [ReaderOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ReaderOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

### Parameters

`chars` - Chars`ReaderOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`

### Parameters

`chars` - Chars

`charset` - Charset`ReaderOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`chars` - Chars

`charset` - Charset`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`

### Parameters

`bytes` - Bytes`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`ReaderOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`bytes` - Bytes

`charset` - Charset`ReaderOf(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

### Parameters

`path` - The path`ReaderOf(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

### Parameters

`file` - The file`ReaderOf(url: `[`URL`](http://docs.oracle.com/javase/8/docs/api/java/net/URL.html)`)`

### Parameters

`url` - The URL`ReaderOf(uri: `[`URI`](http://docs.oracle.com/javase/8/docs/api/java/net/URI.html)`)`

### Parameters

`uri` - The URI`ReaderOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`

### Parameters

`bytes` - The text`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`
`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`ReaderOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`ReaderOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text

`charset` - Charset`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The input

`charset` - The charset`ReaderOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`)`

### Parameters

`input` - The input

`decoder` - The decoder

**Since**
0.13.1

`ReaderOf(stream: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`

### Parameters

`stream` - The stream

`charset` - The charset`ReaderOf(stream: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`stream` - The stream

`charset` - The charset

### Exceptions

`UnsupportedEncodingException` - If fails`ReaderOf(stream: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`, decoder: `[`CharsetDecoder`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/CharsetDecoder.html)`)`

### Parameters

`stream` - The stream

`decoder` - The charset decoder

**Since**
0.13.1

`ReaderOf(source: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`>)`

A [Reader](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.13

