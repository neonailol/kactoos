---
title: StickyBiFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [StickyBiFunc](./index.html)

# StickyBiFunc

`class StickyBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/StickyBiFunc.kt#L32)

Func that accepts two arguments and caches previously calculated values
and doesn't recalculate again.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncBiFunc](../-sync-bi-func/index.html).

This [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.html) decorator technically is an in-memory
cache.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

**See Also**

[StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.html)

**Since**
0.13

### Constructors

| [&lt;init&gt;](-init-.html) | `StickyBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)``StickyBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>, size: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Func that accepts two arguments and caches previously calculated values and doesn't recalculate again. |

### Functions

| [apply](apply.html) | `fun apply(first: `[`X`](index.html#X)`, second: `[`Y`](index.html#Y)`): `[`Z`](index.html#Z)<br>Apply it. |

