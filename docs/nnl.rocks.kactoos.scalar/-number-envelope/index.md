[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [NumberEnvelope](./index.md)

# NumberEnvelope

`open class NumberEnvelope : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`

Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html).

There is no thread-safety guarantee.

### Parameters

`value` - Double scalar

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `NumberEnvelope(value: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)``NumberEnvelope(value: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)`<br>Envelope for the [Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html). |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `open fun invoke(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
| [toByte](to-byte.md) | `fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](to-char.md) | `fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toDouble](to-double.md) | `fun toDouble(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [toFloat](to-float.md) | `fun toFloat(): `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [toInt](to-int.md) | `fun toInt(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toLong](to-long.md) | `fun toLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toShort](to-short.md) | `fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [AvgOf](../-avg-of/index.md) | `class AvgOf : `[`NumberEnvelope`](./index.md)<br>Average of numbers. |
| [LengthOf](../../nnl.rocks.kactoos.io/-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of [Input](../../nnl.rocks.kactoos/-input/index.md). |
| [LengthOf](../../nnl.rocks.kactoos.iterable/-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of iterable. |
| [LengthOf](../../nnl.rocks.kactoos.iterator/-length-of/index.md) | `class LengthOf : `[`NumberEnvelope`](./index.md)<br>Length of iterator. |
| [MaxOf](../-max-of/index.md) | `class MaxOf : `[`NumberEnvelope`](./index.md)<br>Find the greatest value among numbers. |
| [MinOf](../-min-of/index.md) | `class MinOf : `[`NumberEnvelope`](./index.md)<br>Find the smallest value among numbers. |
| [NumberOf](../-number-of/index.md) | `class NumberOf : `[`NumberEnvelope`](./index.md)`, `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html). |
| [SumOf](../-sum-of/index.md) | `class SumOf : `[`NumberEnvelope`](./index.md)<br>Represents total sum of given numbers. |
