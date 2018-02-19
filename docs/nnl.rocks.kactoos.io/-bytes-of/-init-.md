---
title: BytesOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [BytesOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`BytesOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`)``BytesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`

Ctor.

### Parameters

`input` - The input`BytesOf(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`

Ctor.

### Parameters

`file` - The input

**Since**
0.13

`BytesOf(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`

Ctor.

### Parameters

`path` - The input

**Since**
0.13

`BytesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`input` - The input

`max` - Max length of the buffer for reading`BytesOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`)`

Ctor.

### Parameters

`rdr` - Reader`BytesOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`BytesOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`charset` - Charset`BytesOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`BytesOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`charset` - Charset

`max` - Buffer size`BytesOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`max` - Buffer size

**Since**
0.13.3

`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`BytesOf(input: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`input` - The source

`charset` - The charset`BytesOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

Ctor.

### Parameters

`chars` - The chars`BytesOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`BytesOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`chars` - The chars

`charset` - The charset`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`BytesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`text` - The source

`charset` - The charset`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`
`BytesOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`error` - The exception to serialize

`charset` - Charset`BytesOf(vararg strace: `[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`)`

Ctor.

### Parameters

`strace` - The stack trace

**Since**
0.29

`BytesOf(strace: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`>, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`
`BytesOf(strace: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`>, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`

Ctor.

### Parameters

`strace` - The stack trace

`charset` - Charset

**Since**
0.29

`BytesOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`

### Parameters

`bytes` - Bytes to encapsulate`BytesOf(origin: `[`KBytes`](../../nnl.rocks.kactoos/-k-bytes.html)`)`

A [Bytes](../../nnl.rocks.kactoos/-bytes/index.html) that encapsulates other sources of data.

There is no thread-safety guarantee.

**Since**
0.3

