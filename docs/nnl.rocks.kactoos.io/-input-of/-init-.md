[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`InputOf(input: KInput)``InputOf(file: File)`

### Parameters

`file` - The file`InputOf(path: Path)`

### Parameters

`path` - The path`InputOf(uri: URI)`

### Parameters

`uri` - The URI`InputOf(url: URL)`

### Parameters

`url` - The URL`InputOf(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<URL>)`

### Parameters

`scalar` - The url`InputOf(rdr: Reader)`

### Parameters

`rdr` - Reader`InputOf(rdr: Reader, charset: Charset)`
`InputOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`rdr` - Reader

`charset` - Charset`InputOf(rdr: Reader, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`max` - Buffer size

**Since**
0.13.3

`InputOf(rdr: Reader, charset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`InputOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`charset` - Charset

`max` - Buffer size`InputOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

### Parameters

`chars` - The chars`InputOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: Charset)`
`InputOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`chars` - The chars

`charset` - The charset`InputOf(source: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`source` - The string`InputOf(source: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`
`InputOf(source: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`source` - The string

`charset` - The charset`InputOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`

### Parameters

`text` - The text`InputOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`
`InputOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text

`charset` - The charset`InputOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`

### Parameters

`error` - The exception to serialize`InputOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: Charset)`
`InputOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`error` - The exception to serialize

`charset` - Charset`InputOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`

### Parameters

`bytes` - The bytes`InputOf(src: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`

### Parameters

`src` - The bytes`InputOf(stream: InputStream)`

### Parameters

`stream` - The stream`InputOf(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`

An [Input](../../nnl.rocks.kactoos/-input/index.md) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.11.8

