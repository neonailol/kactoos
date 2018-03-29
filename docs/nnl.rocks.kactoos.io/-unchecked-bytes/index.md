[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [UncheckedBytes](./index.md)

# UncheckedBytes

`class UncheckedBytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)

Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedBytes(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`)``UncheckedBytes(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>)`<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [asBytes](as-bytes.md) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |
