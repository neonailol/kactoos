[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [TrimmedText](./index.md)

# TrimmedText

`class TrimmedText : `[`TextEnvelope`](../-text-envelope/index.md)

Text without control characters (char &lt;= 32) from both ends.

There is no thread-safety guarantee.

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TrimmedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)``TrimmedText(origin: `[`KText`](../../nnl.rocks.kactoos/-k-text.md)`)`<br>Text without control characters (char &lt;= 32) from both ends. |

### Inherited Functions

| Name | Summary |
|---|---|
| [asString](../-text-envelope/as-string.md) | `open fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [equals](../-text-envelope/equals.md) | `open fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](../-text-envelope/hash-code.md) | `open fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](../-text-envelope/to-string.md) | `open fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
