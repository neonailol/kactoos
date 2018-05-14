[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputStreamOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`InputStreamOf(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

Ctor.

### Parameters

`path` - The path`InputStreamOf(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

Ctor.

### Parameters

`file` - The file`InputStreamOf(url: `[`URL`](http://docs.oracle.com/javase/8/docs/api/java/net/URL.html)`)`

Ctor.

### Parameters

`url` - The URL`InputStreamOf(uri: `[`URI`](http://docs.oracle.com/javase/8/docs/api/java/net/URI.html)`)`

Ctor.

### Parameters

`uri` - The URI`InputStreamOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`
`InputStreamOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`

Ctor.

### Parameters

`bytes` - The text`InputStreamOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`InputStreamOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`InputStreamOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`InputStreamOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`text` - The text

`charset` - Charset`InputStreamOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`text` - The text`InputStreamOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`InputStreamOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`charset` - Charset

**Since**
0.13.2

`InputStreamOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`cset` - Charset

`max` - Buffer size

**Since**
0.13.2

`InputStreamOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`max` - Buffer size

**Since**
0.13.2

`InputStreamOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`charset` - Charset

`max` - Buffer size

**Since**
0.13.2

`InputStreamOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`

Ctor.

### Parameters

`input` - The input`InputStreamOf(source: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`>)`

An [InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.3

