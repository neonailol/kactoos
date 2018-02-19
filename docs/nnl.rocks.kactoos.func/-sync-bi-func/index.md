---
title: SyncBiFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [SyncBiFunc](./index.html)

# SyncBiFunc

`class SyncBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/SyncBiFunc.kt#L15)

BiFunc that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of first input

`Y` - Type of second input

`Z` - Type of output

**Since**
0.18

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)``SyncBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>BiFunc that is thread-safe. |

### Functions

| [apply](apply.html) | `fun apply(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Z`](index.html#Z)<br>Apply it. |

