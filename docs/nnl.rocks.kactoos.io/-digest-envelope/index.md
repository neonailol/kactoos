[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [DigestEnvelope](./index.md)

# DigestEnvelope

`abstract class DigestEnvelope : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/DigestEnvelope.kt#L19)

Digest Envelope.

There is no thread-safety guarantee.

### Parameters

`source` - The input

`size` - Buffer size

`algorithm` - The algorithm

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DigestEnvelope(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, algrthm: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``DigestEnvelope(source: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, algorithm: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Digest Envelope. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `open fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

### Inheritors

| Name | Summary |
|---|---|
| [Md5DigestOf](../-md5-digest-of/index.md) | `class Md5DigestOf : `[`DigestEnvelope`](./index.md)<br>MD5 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.md). |
| [Sha1DigestOf](../-sha1-digest-of/index.md) | `class Sha1DigestOf : `[`DigestEnvelope`](./index.md)<br>SHA-1 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.md). |
| [Sha256DigestOf](../-sha256-digest-of/index.md) | `class Sha256DigestOf : `[`DigestEnvelope`](./index.md)<br>SHA-256 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.md). |
