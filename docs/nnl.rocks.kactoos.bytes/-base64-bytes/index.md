---
title: Base64Bytes - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.bytes](../index.html) / [Base64Bytes](./index.html)

# Base64Bytes

`class Base64Bytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/bytes/Base64Bytes.kt#L14)

Decodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`decoder` - Which [Base64.Decoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Decoder.html) to use.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`)`<br>Uses [Base64.getDecoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64.html#getDecoder()) as [decoder](#)`Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`, decoder: `[`Decoder`](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Decoder.html)`)`<br>Decodes all origin bytes using the Base64 encoding scheme. |

### Functions

| [asBytes](as-bytes.html) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

