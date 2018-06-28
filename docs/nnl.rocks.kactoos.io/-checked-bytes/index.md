[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [CheckedBytes](./index.md)

# CheckedBytes

`class CheckedBytes<E> : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)

Bytes that throws exception of specified type.

### Parameters

`E` - Exception's type.

`origin` - Origin bytes.

`func` - Function that wraps exceptions.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedBytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>Bytes that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
