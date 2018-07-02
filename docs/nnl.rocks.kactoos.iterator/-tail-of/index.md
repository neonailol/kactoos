[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [TailOf](./index.md)

# TailOf

`class TailOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>`

Tail portion of the iterator.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

`iterator` - Decorated iterator

`num` - Number of tail elements

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TailOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>Tail portion of the iterator. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`T`](index.md#T) |
