[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [NumberEnvelope](./index.md)

# NumberEnvelope

`open class NumberEnvelope : `[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`, `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/NumberEnvelope.kt#L16)

Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html).

There is no thread-safety guarantee.

### Parameters

`dnum` - Double scalar

**Since**
0.26

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `NumberEnvelope(dnum: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |

### Functions

| Name | Summary |
|---|---|
| [toByte](to-byte.md) | `open fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](to-char.md) | `open fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toDouble](to-double.md) | `open fun toDouble(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [toFloat](to-float.md) | `open fun toFloat(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [toInt](to-int.md) | `open fun toInt(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toLong](to-long.md) | `open fun toLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toShort](to-short.md) | `open fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [value](value.md) | `open fun value(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Convert it to the value. |

### Inheritors

| Name | Summary |
|---|---|
| [AvgOf](../-avg-of/index.md) | `class AvgOf : `[`NumberEnvelope`](./index.md)<br>Average of numbers. |
| [LengthOf](../../nnl.rocks.kactoos.io/-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of [Input](../../nnl.rocks.kactoos/-input/index.md). |
| [LengthOf](../../nnl.rocks.kactoos.iterable/-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of iterable. |
| [LengthOf](../../nnl.rocks.kactoos.iterator/-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of iterator. |
| [MaxOf](../-max-of/index.md) | `class MaxOf : `[`NumberEnvelope`](./index.md)<br>Find the greater among items. |
| [MinOf](../-min-of/index.md) | `class MinOf : `[`NumberEnvelope`](./index.md)<br>Find the smaller among items. |
| [NumberOf](../-number-of/index.md) | `class NumberOf : `[`NumberEnvelope`](./index.md)`, `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html). |
| [SumOf](../-sum-of/index.md) | `class SumOf : `[`NumberEnvelope`](./index.md)<br>Int total of numbers. |
