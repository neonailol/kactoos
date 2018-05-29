[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorOf](./index.md)

# IteratorOf

`class IteratorOf<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>`

Iterator that returns the set of elements.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

`items` - Items to iterate

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IteratorOf(vararg items: `[`X`](index.md#X)`)` |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`X`](index.md#X) |
