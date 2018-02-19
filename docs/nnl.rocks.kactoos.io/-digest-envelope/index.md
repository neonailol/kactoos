---
title: DigestEnvelope - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [DigestEnvelope](./index.html)

# DigestEnvelope

`abstract class DigestEnvelope : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/DigestEnvelope.kt#L19)

Digest Envelope.

There is no thread-safety guarantee.

### Parameters

`source` - The input

`size` - Buffer size

`algorithm` - The algorithm

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `DigestEnvelope(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, algrthm: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``DigestEnvelope(source: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, algorithm: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Digest Envelope. |

### Functions

| [asBytes](as-bytes.html) | `open fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

### Inheritors

| [Md5DigestOf](../-md5-digest-of/index.html) | `class Md5DigestOf : `[`DigestEnvelope`](./index.md)<br>MD5 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.html). |
| [Sha1DigestOf](../-sha1-digest-of/index.html) | `class Sha1DigestOf : `[`DigestEnvelope`](./index.md)<br>SHA-1 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.html). |
| [Sha256DigestOf](../-sha256-digest-of/index.html) | `class Sha256DigestOf : `[`DigestEnvelope`](./index.md)<br>SHA-256 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.html). |

