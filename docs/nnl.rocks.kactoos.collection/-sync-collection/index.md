[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [SyncCollection](./index.md)

# SyncCollection

`class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) to re-fresh
its content on every call, by doing round-trips to
the encapsulated iterable, use [StickyCollection](../-sticky-collection/index.md).

Objects of this class are thread-safe.

### Parameters

`T` - List type

**See Also**

[StickyCollection](../-sticky-collection/index.md)

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncCollection(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>`SyncCollection(vararg array: `[`T`](index.md#T)`)`<br>`SyncCollection(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)` |
