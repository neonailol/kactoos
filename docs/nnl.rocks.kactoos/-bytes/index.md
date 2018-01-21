[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Bytes](.)

# Bytes

`@FunctionalInterface interface Bytes` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Bytes.kt#L14)

Bytes.

There is no thread-safety guarantee.

**See Also**

[nnl.rocks.kactoos.io.BytesOf](../../nnl.rocks.kactoos.io/-bytes-of/index.md)

**Since**
0.1

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `abstract fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

### Inheritors

| Name | Summary |
|---|---|
| [Base64Bytes](../../nnl.rocks.kactoos.bytes/-base64-bytes/index.md) | `class Base64Bytes : Bytes`<br>Decodes all origin bytes using the Base64 encoding scheme. |
| [BytesBase64](../../nnl.rocks.kactoos.bytes/-bytes-base64/index.md) | `class BytesBase64 : Bytes`<br>Encodes all origin bytes using the Base64 encoding scheme. |
| [BytesOf](../../nnl.rocks.kactoos.io/-bytes-of/index.md) | `class BytesOf : Bytes`<br>A Bytes that encapsulates other sources of data. |
| [EmptyBytes](../../nnl.rocks.kactoos.io/-empty-bytes/index.md) | `class EmptyBytes : Bytes`<br>Bytes with no data. |
| [UncheckedBytes](../../nnl.rocks.kactoos.io/-unchecked-bytes/index.md) | `class UncheckedBytes : Bytes`<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
