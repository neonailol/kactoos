---
title: UncheckedScalar - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [UncheckedScalar](./index.html)

# UncheckedScalar

`class UncheckedScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/UncheckedScalar.kt#L19)

Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`origin` - Encapsulated origin

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedScalar(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>)`<br>Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [value](value.html) | `fun value(): `[`T`](index.html#T)<br>Convert it to the value. |

