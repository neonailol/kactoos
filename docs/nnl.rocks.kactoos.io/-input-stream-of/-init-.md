[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputStreamOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`InputStreamOf(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<InputStream>)`
`InputStreamOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)``InputStreamOf(path: Path)`

### Parameters

`path` - The path`InputStreamOf(file: File)`

### Parameters

`file` - The file`InputStreamOf(url: URL)`

### Parameters

`url` - The URL`InputStreamOf(uri: URI)`

### Parameters

`uri` - The URI`InputStreamOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`
`InputStreamOf(bytes: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`)`

### Parameters

`bytes` - The text`InputStreamOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: Charset)`
`InputStreamOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`InputStreamOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: Charset)`
`InputStreamOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text

`charset` - Charset`InputStreamOf(text: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The text`InputStreamOf(rdr: Reader, charset: Charset = StandardCharsets.UTF_8)`
`InputStreamOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`rdr` - Reader

`charset` - Charset

**Since**
0.13.2

`InputStreamOf(rdr: Reader, cset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`cset` - Charset

`max` - Buffer size

**Since**
0.13.2

`InputStreamOf(rdr: Reader, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`max` - Buffer size

**Since**
0.13.2

`InputStreamOf(rdr: Reader, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`charset` - Charset

`max` - Buffer size

**Since**
0.13.2

`InputStreamOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`

### Parameters

`input` - The input`InputStreamOf(source: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<InputStream>)`

An [InputStream](#) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.13

