---
title: TextOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [TextOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`

Ctor.

### Parameters

`input` - The Input`TextOf(url: `[`URL`](http://docs.oracle.com/javase/8/docs/api/java/net/URL.html)`)`

Ctor.

### Parameters

`url` - The URL

**Since**
0.16

`TextOf(uri: `[`URI`](http://docs.oracle.com/javase/8/docs/api/java/net/URI.html)`)`

Ctor.

### Parameters

`uri` - The URI

**Since**
0.16

`TextOf(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

Ctor.

### Parameters

`path` - The Input

**Since**
0.13

`TextOf(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

Ctor.

### Parameters

`file` - The Input

**Since**
0.13

`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Ctor.

### Parameters

`input` - The Input

`cset` - The Charset`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`

Ctor.

### Parameters

`input` - The input

`max` - Max length of the buffer for reading

`cset` - The Charset`TextOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`)`

Ctor.

### Parameters

`rdr` - Reader`TextOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`cset` - Charset`TextOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`cset` - Charset

`max` - Buffer size`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`builder` - The String builder`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`

Ctor.

### Parameters

`builder` - The String builder

`cset` - The Charset`TextOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

Ctor.

### Parameters

`chars` - The chars`TextOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`

Ctor.

### Parameters

`chars` - The chars

`cset` - The charset`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`

Ctor.

### Parameters

`error` - The exception to serialize`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`error` - The exception to serialize

`charset` - Charset

**Since**
0.29

`TextOf(vararg strace: `[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`)`

Ctor.

### Parameters

`strace` - The stacktrace to serialize

**Since**
0.29

`TextOf(strace: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`>, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`TextOf(strace: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`>, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`strace` - The stacktrace to serialize

`charset` - Charset

**Since**
0.29

`TextOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`

Ctor.

### Parameters

`bytes` - The array of bytes`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Ctor.

### Parameters

`bytes` - The Bytes

`cset` - The Charset`TextOf(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`

Ctor.

### Parameters

`input` - The String

`cset` - The Charset`TextOf(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`

Ctor.

### Parameters

`iterable` - The iterable to convert to string

**Since**
0.21

`TextOf(input: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`)`

Ctor.

### Parameters

`input` - The InputStream where the text is read from

**Since**
0.21

