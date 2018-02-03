[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [StickyCollection](./index.md)

# StickyCollection

`class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`E`](index.md#E)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/StickyCollection.kt#L17)

Collection decorator that goes through the list only once.

There is no thread-safety guarantee.

### Parameters

`E` - Type of item

**Since**
0.16

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyCollection(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`E`](index.md#E)`>)`<br>`StickyCollection(vararg items: `[`E`](index.md#E)`)`<br>`StickyCollection(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`E`](index.md#E)`>)`<br>`StickyCollection(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`E`](index.md#E)`>)` |
