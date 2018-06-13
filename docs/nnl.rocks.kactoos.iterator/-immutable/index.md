[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Immutable](./index.md)

# Immutable

`class Immutable<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>`

Iterator that doesn't allow removal of elements.

There is no thread-safety guarantee.

### Parameters

`T` - Element type.

`iterator` - Encapsulated iterator.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Immutable(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>Iterator that doesn't allow removal of elements. |

### Functions

| Name | Summary |
|---|---|
| [next](next.md) | `fun next(): `[`T`](index.md#T) |
