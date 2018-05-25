[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [StickyIterator](./index.md)

# StickyIterator

`class StickyIterator<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>`

Iterator that returns the same set of elements always.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyIterator(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)`<br>`StickyIterator(vararg items: `[`X`](index.md#X)`)` |
