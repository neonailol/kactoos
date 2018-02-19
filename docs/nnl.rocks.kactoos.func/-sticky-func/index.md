---
title: StickyFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [StickyFunc](./index.html)

# StickyFunc

`class StickyFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/StickyFunc.kt#L25)

Func that caches previously calculated values and doesn't
recalculate again.

This [Func](../../nnl.rocks.kactoos/-func/index.html) decorator technically is an in-memory
cache.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncFunc](../-sync-func/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

**See Also**

[StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.html)

**Since**
0.1

### Constructors

| [&lt;init&gt;](-init-.html) | `StickyFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`StickyFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)``StickyFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`Y`](index.html#Y)`>)`<br>Func that caches previously calculated values and doesn't recalculate again. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

