[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TextOf](./index.md)

# TextOf

`class TextOf : `[`TextEnvelope`](../-text-envelope/index.md)

TextOf

There is no thread-safety guarantee.

### Parameters

`origin` - The KScalar of String

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`TextOf(url: `[`URL`](http://docs.oracle.com/javase/8/docs/api/java/net/URL.html)`)`<br>`TextOf(uri: `[`URI`](http://docs.oracle.com/javase/8/docs/api/java/net/URI.html)`)`<br>`TextOf(path: `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`)`<br>`TextOf(file: `[`File`](http://docs.oracle.com/javase/8/docs/api/java/io/File.html)`)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TextOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`<br>`TextOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`)`<br>`TextOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TextOf(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`TextOf(builder: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TextOf(vararg chars: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>`TextOf(chars: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TextOf(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`TextOf(vararg strace: `[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`)`<br>`TextOf(strace: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`>, charset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)`)`<br>`TextOf(strace: `[`Array`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)`<`[`StackTraceElement`](http://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)`>, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`TextOf(vararg bytes: `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`)`<br>`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`<br>`TextOf(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, cset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TextOf(input: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8)`<br>`TextOf(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>)`<br>`TextOf(input: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`)`<br>Ctor. |

### Inherited Functions

| Name | Summary |
|---|---|
| [asString](../-text-envelope/as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](../-text-envelope/equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](../-text-envelope/hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](../-text-envelope/to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
