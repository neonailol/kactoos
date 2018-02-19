---
title: ReaderAsBytes - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [ReaderAsBytes](./index.html)

# ReaderAsBytes

`class ReaderAsBytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/ReaderAsBytes.kt#L22)

Reader as [Bytes](../../nnl.rocks.kactoos/-bytes/index.html).

This class is for internal use only. Use [BytesOf](../-bytes-of/index.html) instead.

There is no thread-safety guarantee.

### Parameters

`reader` - Reader

`charset` - Charset

`size` - Buffer size

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `ReaderAsBytes(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, cset: `[`Charset`](http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)` = StandardCharsets.UTF_8, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`<br>`ReaderAsBytes(rdr: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Ctor.`ReaderAsBytes(reader: `[`Reader`](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html)`, charset: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16 shl 10)`<br>Reader as [Bytes](../../nnl.rocks.kactoos/-bytes/index.html). |

### Functions

| [asBytes](as-bytes.html) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

