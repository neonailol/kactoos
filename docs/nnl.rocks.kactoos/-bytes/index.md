[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Bytes](./index.md)

# Bytes

`expect interface Bytes`

Bytes.

**Since**
0.2

### Types

| Name | Summary |
|---|---|
| [NoNulls](-no-nulls/index.md) | `class NoNulls : `[`Bytes`](./index.md) |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `abstract fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

### Inheritors

| Name | Summary |
|---|---|
| [Base64Bytes](../../nnl.rocks.kactoos.bytes/-base64-bytes/index.md) | `class Base64Bytes : `[`Bytes`](./index.md)<br>Decodes all origin bytes using the Base64 encoding scheme. |
| [BytesBase64](../../nnl.rocks.kactoos.bytes/-bytes-base64/index.md) | `class BytesBase64 : `[`Bytes`](./index.md)<br>Encodes all origin bytes using the Base64 encoding scheme. |
| [BytesOf](../../nnl.rocks.kactoos.io/-bytes-of/index.md) | `class BytesOf : `[`Bytes`](./index.md)<br>A [Bytes](./index.md) that encapsulates other sources of data. |
| [DigestEnvelope](../../nnl.rocks.kactoos.io/-digest-envelope/index.md) | `abstract class DigestEnvelope : `[`Bytes`](./index.md)<br>Digest Envelope. |
| [EmptyBytes](../../nnl.rocks.kactoos.io/-empty-bytes/index.md) | `class EmptyBytes : `[`Bytes`](./index.md)<br>Bytes with no data. |
| [NoNulls](-no-nulls/index.md) | `class NoNulls : `[`Bytes`](./index.md) |
| [UncheckedBytes](../../nnl.rocks.kactoos.io/-unchecked-bytes/index.md) | `class UncheckedBytes : `[`Bytes`](./index.md)<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
