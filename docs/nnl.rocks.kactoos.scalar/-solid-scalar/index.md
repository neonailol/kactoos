---
title: SolidScalar - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [SolidScalar](./index.html)

# SolidScalar

`class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/SolidScalar.kt#L21)

Cached and synchronized version of a Scalar.

Objects of this class are thread safe.

### Parameters

`T` - Type of result

`func` - Cached func

**See Also**

[StickyScalar](../-sticky-scalar/index.html)

[SyncScalar](../-sync-scalar/index.html)

**Since**
0.24

### Constructors

| [&lt;init&gt;](-init-.html) | `SolidScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>)``SolidScalar(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`T`](index.html#T)`>)`<br>Cached and synchronized version of a Scalar. |

### Functions

| [value](value.html) | `fun value(): `[`T`](index.html#T)<br>Convert it to the value. |

