---
title: Folded - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [Folded](./index.html)

# Folded

`class Folded<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/Folded.kt#L29)

Folds iterable via BiFunc.

```
new Folded<>(
(first, last) -> first + last,
new IterableOf<>(() -> 1L, () -> 2L, () -> 3L, () -> 4L)
).value() // returns 10L
```

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

### Parameters

`T` - Scalar type

`function` - Folding function

`items` - The scalars

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `Folded(function: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`T`](index.html#T)`, `[`T`](index.html#T)`, `[`T`](index.html#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>>)`<br>Folds iterable via BiFunc. |

### Functions

| [value](value.html) | `fun value(): `[`T`](index.html#T)<br>Convert it to the value. |

