---
title: NumberEnvelope - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [NumberEnvelope](./index.html)

# NumberEnvelope

`open class NumberEnvelope : `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/NumberEnvelope.kt#L16)

Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html).

There is no thread-safety guarantee.

### Parameters

`dnum` - Double scalar

**Since**
0.26

### Constructors

| [&lt;init&gt;](-init-.html) | `NumberEnvelope(dnum: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |

### Functions

| [toByte](to-byte.html) | `open fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](to-char.html) | `open fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toDouble](to-double.html) | `open fun toDouble(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [toFloat](to-float.html) | `open fun toFloat(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [toInt](to-int.html) | `open fun toInt(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toLong](to-long.html) | `open fun toLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toShort](to-short.html) | `open fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [value](value.html) | `open fun value(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Convert it to the value. |

### Inheritors

| [AvgOf](../-avg-of/index.html) | `class AvgOf : `[`NumberEnvelope`](./index.md)<br>Average of numbers. |
| [LengthOf](../../nnl.rocks.kactoos.io/-length-of/index.html) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of [Input](../../nnl.rocks.kactoos/-input/index.html). |
| [LengthOf](../../nnl.rocks.kactoos.iterable/-length-of/index.html) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of iterable. |
| [LengthOf](../../nnl.rocks.kactoos.iterator/-length-of/index.html) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of iterator. |
| [MaxOf](../-max-of/index.html) | `class MaxOf : `[`NumberEnvelope`](./index.md)<br>Find the greater among items. |
| [MinOf](../-min-of/index.html) | `class MinOf : `[`NumberEnvelope`](./index.md)<br>Find the smaller among items. |
| [NumberOf](../-number-of/index.html) | `class NumberOf : `[`NumberEnvelope`](./index.md)`, `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html). |
| [SumOf](../-sum-of/index.html) | `class SumOf : `[`NumberEnvelope`](./index.md)<br>Represents total sum of given numbers. |

