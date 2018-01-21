[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeInput](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`TeeInput(url: URL, path: Path)`

### Parameters

`url` - The source

`path` - The output file

**Since**
0.13.3

`TeeInput(url: URL, file: File)`

### Parameters

`url` - The source

`file` - The output file

**Since**
0.13.3

`TeeInput(url: URL, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`url` - The source

`output` - The output file

**Since**
0.13.3

`TeeInput(uri: URI, path: Path)`

### Parameters

`uri` - The source

`path` - The output file

**Since**
0.13.3

`TeeInput(uri: URI, file: File)`

### Parameters

`uri` - The source

`file` - The output file

**Since**
0.13.3

`TeeInput(uri: URI, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`uri` - The source

`output` - The output file

**Since**
0.13.3

`TeeInput(input: Path, path: Path)`
`TeeInput(input: File, path: Path)`

### Parameters

`input` - The source

`path` - The output file

**Since**
0.5

`TeeInput(input: Path, file: File)`
`TeeInput(input: File, file: File)`
`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, file: File)`
`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, file: Path)`
`TeeInput(input: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, file: File)`
`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, file: File)`

### Parameters

`input` - The source

`file` - The output file

**Since**
0.5

`TeeInput(input: Path, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`
`TeeInput(input: File, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`input` - The source

`output` - The output

**Since**
0.13.3

`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, file: File, charset: Charset)`
`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, file: File, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, file: Path, charset: Charset)`
`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, file: Path, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`TeeInput(input: Reader, file: File, charset: Charset)`
`TeeInput(input: Reader, file: File, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`TeeInput(input: Reader, file: Path, charset: Charset)`
`TeeInput(input: Reader, file: Path, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`file` - The output file

`charset` - The charset

**Since**
0.13.3

`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`input` - The source

`output` - The target

**Since**
0.5

`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset)`
`TeeInput(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`TeeInput(input: Reader, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset)`
`TeeInput(input: Reader, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`output` - The target

`charset` - The charset

**Since**
0.13.3

`TeeInput(input: Reader, file: File)`
`TeeInput(input: Reader, file: Path)`
`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, file: File)`

### Parameters

`input` - The source

`file` - The output file

**Since**
0.13.3

`TeeInput(input: Reader, file: File, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TeeInput(input: Reader, file: Path, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The source

`file` - The output file

`size` - Reading buffer size

**Since**
0.13.3

`TeeInput(input: Reader, file: File, charset: Charset, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TeeInput(input: Reader, file: File, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TeeInput(input: Reader, file: Path, charset: Charset, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TeeInput(input: Reader, file: Path, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The source

`file` - The output file

`charset` - The charset

`size` - Reading buffer size

**Since**
0.13.3

`TeeInput(input: Reader, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`input` - The source

`output` - The target

**Since**
0.13.3

`TeeInput(input: Reader, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The source

`output` - The target

`size` - Reading buffer size

**Since**
0.13.3

`TeeInput(input: Reader, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TeeInput(input: Reader, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The source

`output` - The target

`charset` - The charset

`size` - Reading buffer size

**Since**
0.13.3

`TeeInput(input: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, path: Path)`
`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, path: Path)`

### Parameters

`input` - The source

`path` - The output path

**Since**
0.5

`TeeInput(input: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`
`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`input` - The source

`output` - The output file

**Since**
0.5

`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, path: Path, charset: Charset)`
`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, path: Path, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`path` - The output path

`charset` - Charset

**Since**
0.13.3

`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, file: File, charset: Charset)`
`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, file: File, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`file` - The output file

`charset` - Charset

**Since**
0.13.3

`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset)`
`TeeInput(input: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`output` - The output file

`charset` - Charset

**Since**
0.13.3

`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, path: Path)`

### Parameters

`text` - The source

`path` - The output path

**Since**
0.13.3

`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, path: Path, charset: Charset)`
`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, path: Path, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The source

`path` - The output path

`charset` - Charset

**Since**
0.13.3

`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, file: File)`

### Parameters

`text` - The source

`file` - The output file

**Since**
0.13.3

`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, file: File, charset: Charset)`
`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, file: File, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The source

`file` - The output file

`charset` - Charset

**Since**
0.13.3

`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`text` - The source

`output` - The output

**Since**
0.13.3

`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: Charset)`
`TeeInput(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`text` - The source

`output` - The output

`charset` - Charset

**Since**
0.13.3

`TeeInput(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, path: Path)`

### Parameters

`bytes` - The source

`path` - The output path

**Since**
0.13.3

`TeeInput(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, file: File)`

### Parameters

`bytes` - The source

`file` - The output file

**Since**
0.13.3

`TeeInput(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

### Parameters

`bytes` - The source

`output` - The output

**Since**
0.13.3

`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, path: Path)`

### Parameters

`input` - The source

`path` - The output path

**Since**
0.13.3

`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, writer: Writer)`

### Parameters

`input` - The source

`writer` - The output

**Since**
0.13.3

`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, writer: Writer, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The source

`writer` - The output

`size` - Writing buffer size

**Since**
0.13.3

`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, writer: Writer, charset: Charset)`
`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, writer: Writer, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`input` - The source

`writer` - The output

`charset` - The charset

**Since**
0.13.3

`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, writer: Writer, charset: Charset, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TeeInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, writer: Writer, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`input` - The source

`writer` - The output

`charset` - The charset

`size` - Writing buffer size

**Since**
0.13.3

`TeeInput(source: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, target: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

Input to Output copying pipe.

There is no thread-safety guarantee.

**Since**
0.1

