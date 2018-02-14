[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [Sha1DigestOf](./index.md)

# Sha1DigestOf

`class Sha1DigestOf : `[`DigestEnvelope`](../-digest-envelope/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/Sha1DigestOf.kt#L12)

SHA-1 checksum calculation of [Input](../../nnl.rocks.kactoos/-input/index.md).

There is no thread-safety guarantee.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sha1DigestOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`Sha1DigestOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [asBytes](../-digest-envelope/as-bytes.md) | `open fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |