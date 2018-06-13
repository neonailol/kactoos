[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [StickyIterable](./index.md)

# StickyIterable

`class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`X`](index.md#X)`>`

Iterable that returns the same set of elements, always.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyIterable(vararg src: `[`X`](index.md#X)`)``StickyIterable(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>Iterable that returns the same set of elements, always. |
