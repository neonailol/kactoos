[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TextEnvelope](./index.md)

# TextEnvelope

`abstract class TextEnvelope : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Text envelope that provides equals and hashCode methods.

### Parameters

`origin` - String value of the envelope.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TextEnvelope(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`TextEnvelope(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)``TextEnvelope(origin: `[`IoCheckedScalar`](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Text envelope that provides equals and hashCode methods. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
