---
title: BoolOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [BoolOf](./index.html)

# BoolOf

`class BoolOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/BoolOf.kt#L25)

Text as [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html).

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

### Parameters

`origin` - True or false text

**Since**
0.2

### Constructors

| [&lt;init&gt;](-init-.html) | `BoolOf(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``BoolOf(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`<br>Text as [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |

### Functions

| [value](value.html) | `fun value(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert it to the value. |

