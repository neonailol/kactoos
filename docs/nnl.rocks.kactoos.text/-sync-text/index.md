---
title: SyncText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [SyncText](./index.html)

# SyncText

`class SyncText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/SyncText.kt#L16)

Text that is thread-safe.

### Parameters

`origin` - The text

`lock` -

The lock




There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)``SyncText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Text that is thread-safe. |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

