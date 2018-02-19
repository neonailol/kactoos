[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [ReaderAsBytes](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ReaderAsBytes(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`

Ctor.

### Parameters

`rdr` - Reader

`cset` - Charset

`max` - Buffer size`ReaderAsBytes(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Ctor.

### Parameters

`rdr` - Reader

`max` - Buffer size

**Since**
0.13.3

`ReaderAsBytes(reader: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`

Reader as [Bytes](../../nnl.rocks.kactoos/-bytes/index.md).

This class is for internal use only. Use [BytesOf](../-bytes-of/index.md) instead.

There is no thread-safety guarantee.

### Parameters

`reader` - Reader

`charset` - Charset

`size` - Buffer size

**Since**
0.3

