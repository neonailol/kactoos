[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [StickyCollection](./index.md)

# StickyCollection

`class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`E`](index.md#E)`>`

Collection decorator that goes through the list only once.

There is no thread-safety guarantee.

### Parameters

`E` - Type of item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyCollection(source: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`E`](index.md#E)`>)`<br>`StickyCollection(vararg args: `[`E`](index.md#E)`)`<br>`StickyCollection(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](index.md#E)`>)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
