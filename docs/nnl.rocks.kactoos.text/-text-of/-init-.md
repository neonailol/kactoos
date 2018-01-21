[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TextOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`

### Parameters

`input` - The Input`TextOf(url: URL)`

### Parameters

`url` - The URL

**Since**
0.16

`TextOf(uri: URI)`

### Parameters

`uri` - The URI

**Since**
0.16

`TextOf(path: Path)`

### Parameters

`path` - The Input

**Since**
0.13

`TextOf(file: File)`

### Parameters

`file` - The Input

**Since**
0.13

`TextOf(input: InputStream)`
`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`
`TextOf(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, cset: Charset)`
`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

### Parameters

`input` - The Input

`cset` - The Charset`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, cset: Charset)`

### Parameters

`input` - The input

`max` - Max length of the buffer for reading

`cset` - The Charset`TextOf(rdr: Reader)`

### Parameters

`rdr` - Reader`TextOf(rdr: Reader, cset: Charset)`

### Parameters

`rdr` - Reader

`cset` - Charset`TextOf(rdr: Reader, cset: Charset, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`rdr` - Reader

`cset` - Charset

`max` - Buffer size`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

### Parameters

`builder` - The String builder`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, cset: Charset)`

### Parameters

`builder` - The String builder

`cset` - The Charset`TextOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

### Parameters

`chars` - The chars`TextOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, cset: Charset)`

### Parameters

`chars` - The chars

`cset` - The charset`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`

### Parameters

`error` - The exception to serialize`TextOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`

### Parameters

`bytes` - The array of bytes`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, cset: Charset)`
`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

### Parameters

`bytes` - The Bytes

`cset` - The Charset`TextOf(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cset: Charset)`

### Parameters

`input` - The String

`cset` - The Charset`TextOf(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`

### Parameters

`iterable` - The iterable to convert to string

**Since**
0.21

