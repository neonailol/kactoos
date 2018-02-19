---
title: StickyScalar - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [StickyScalar](./index.html)

# StickyScalar

`class StickyScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/StickyScalar.kt#L32)

Cached version of a Scalar.

This [Scalar](../../nnl.rocks.kactoos/-scalar/index.html) decorator technically is an in-memory
cache.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncScalar](../-sync-scalar/index.html).

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`func` - Cached func

**See Also**

[StickyFunc](../../nnl.rocks.kactoos.func/-sticky-func/index.html)

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `StickyScalar(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>)``StickyScalar(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`T`](index.html#T)`>)`<br>Cached version of a Scalar. |

### Functions

| [value](value.html) | `fun value(): `[`T`](index.html#T)<br>Convert it to the value. |

