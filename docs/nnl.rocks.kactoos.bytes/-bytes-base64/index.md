[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.bytes](../index.md) / [BytesBase64](./index.md)

# BytesBase64

`class BytesBase64 : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/bytes/BytesBase64.kt#L14)

Encodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`encoder` - Which [Base64.Encoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Encoder.html) to use

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BytesBase64(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>Uses [Base64.getEncoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64.html#getEncoder()) as [encoder](#)`BytesBase64(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, encoder: `[`Encoder`](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Encoder.html)`)`<br>Encodes all origin bytes using the Base64 encoding scheme. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
