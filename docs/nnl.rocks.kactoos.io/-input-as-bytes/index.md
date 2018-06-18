[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputAsBytes](./index.md)

# InputAsBytes

`internal class InputAsBytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)

Input as Byte Array.

This class is for internal use only. Use [BytesOf](../-bytes-of/index.md) instead.

There is no thread-safety guarantee.

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputAsBytes(source: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)``InputAsBytes(source: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Input as Byte Array. |

### Properties

| Name | Summary |
|---|---|
| [size](size.md) | `val size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [source](source.md) | `val source: `[`Input`](../../nnl.rocks.kactoos/-input/index.md) |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
