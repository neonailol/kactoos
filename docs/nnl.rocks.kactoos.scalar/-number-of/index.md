---
title: NumberOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [NumberOf](./index.html)

# NumberOf

`class NumberOf : `[`NumberEnvelope`](../-number-envelope/index.html)`, `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/NumberOf.kt#L24)

Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html).

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

**Since**
0.2

### Constructors

| [&lt;init&gt;](-init-.html) | `NumberOf(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`NumberOf(txt: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)``NumberOf(dnum: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)`<br>Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html). |

### Inherited Functions

| [toByte](../-number-envelope/to-byte.html) | `open fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](../-number-envelope/to-char.html) | `open fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toDouble](../-number-envelope/to-double.html) | `open fun toDouble(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [toFloat](../-number-envelope/to-float.html) | `open fun toFloat(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [toInt](../-number-envelope/to-int.html) | `open fun toInt(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toLong](../-number-envelope/to-long.html) | `open fun toLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toShort](../-number-envelope/to-short.html) | `open fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [value](../-number-envelope/value.html) | `open fun value(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Convert it to the value. |

