[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [SubText](./index.md)

# SubText

`class SubText : `[`TextEnvelope`](../-text-envelope/index.md)

Extract a substring from a Text.

There is no thread-safety guarantee.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SubText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, start: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, end: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>)`<br>`SubText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SubText(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, finish: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SubText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SubText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, strt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, finish: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [asString](../-text-envelope/as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](../-text-envelope/equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](../-text-envelope/hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](../-text-envelope/to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
