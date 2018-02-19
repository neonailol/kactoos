[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.bytes](../index.md) / [Base64Bytes](./index.md)

# Base64Bytes

`class Base64Bytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/bytes/Base64Bytes.kt#L14)

Decodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`decoder` - Which [Base64.Decoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Decoder.html) to use.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)`<br>Uses [Base64.getDecoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64.html#getDecoder()) as [decoder](#)`Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, decoder: `[`Decoder`](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Decoder.html)`)`<br>Decodes all origin bytes using the Base64 encoding scheme. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
