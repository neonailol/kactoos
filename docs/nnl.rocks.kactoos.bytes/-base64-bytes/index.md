[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.bytes](../index.md) / [Base64Bytes](.)

# Base64Bytes

`class Base64Bytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/bytes/Base64Bytes.kt#L14)

Decodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`decoder` - Which [Base64.Decoder](#) to use.

**Since**
0.20.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>Uses [Base64.getDecoder](#) as [decoder](#)`Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, decoder: Decoder)`<br>Decodes all origin bytes using the Base64 encoding scheme. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
