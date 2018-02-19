---
title: BytesBase64 - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.bytes](../index.html) / [BytesBase64](./index.html)

# BytesBase64

`class BytesBase64 : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/bytes/BytesBase64.kt#L14)

Encodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`encoder` - Which [Base64.Encoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Encoder.html) to use

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `BytesBase64(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`)`<br>Uses [Base64.getEncoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64.html#getEncoder()) as [encoder](#)`BytesBase64(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`, encoder: `[`Encoder`](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Encoder.html)`)`<br>Encodes all origin bytes using the Base64 encoding scheme. |

### Functions

| [asBytes](as-bytes.html) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

