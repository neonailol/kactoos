[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.bytes](../index.md) / [BytesBase64](.)

# BytesBase64

`class BytesBase64 : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/bytes/BytesBase64.kt#L14)

Encodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`encoder` - Which [Base64.Encoder](#) to use

**Since**
0.20.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BytesBase64(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>Uses [Base64.getEncoder](#) as [encoder](#)`BytesBase64(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, encoder: Encoder)`<br>Encodes all origin bytes using the Base64 encoding scheme. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
