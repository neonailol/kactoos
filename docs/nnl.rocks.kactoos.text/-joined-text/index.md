[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [JoinedText](./index.md)

# JoinedText

`class JoinedText : `[`TextEnvelope`](../-text-envelope/index.md)

Join a Text.

There is no thread-safety guarantee.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `JoinedText(delimiter: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, texts: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>)`<br>`JoinedText(delimit: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, vararg strs: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`JoinedText(delimit: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strs: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>`JoinedText(delimit: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, vararg txts: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [asString](../-text-envelope/as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](../-text-envelope/equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](../-text-envelope/hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](../-text-envelope/to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
