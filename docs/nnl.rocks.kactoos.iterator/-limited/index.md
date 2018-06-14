[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Limited](./index.md)

# Limited

`class Limited<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>`

Limited origin.

This is a decorator over an existing origin. Returns elements of the
original origin, until either the requested number of items have been
returned or the underlying origin has been exhausted.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.6

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Limited(restrict: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, origin: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>Limited origin. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`T`](index.md#T) |