---
title: UncheckedBytes - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [UncheckedBytes](./index.html)

# UncheckedBytes

`class UncheckedBytes : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/UncheckedBytes.kt#L18)

Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedBytes(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`)``UncheckedBytes(bytes: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`>)`<br>Bytes that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [asBytes](as-bytes.html) | `fun asBytes(): `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)<br>Convert it to the byte array. |

