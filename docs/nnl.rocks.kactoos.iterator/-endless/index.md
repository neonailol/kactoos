---
title: Endless - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [Endless](./index.html)

# Endless

`class Endless<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/Endless.kt#L18)

Iterator that never ends.

If you need to repeat certain amount of time, use [Repeated](../-repeated/index.html).

### Parameters

`T` - Element type

**Since**
0.4

### Constructors

| [&lt;init&gt;](-init-.html) | `Endless(element: `[`T`](index.html#T)`)`<br>`Endless(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>)`<br>Ctor.`Endless(origin: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`T`](index.html#T)`>)`<br>Iterator that never ends. |

### Functions

| [hasNext](has-next.html) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.html) | `fun next(): `[`T`](index.html#T) |

