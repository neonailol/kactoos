---
title: SyncCollection - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.collection](../index.html) / [SyncCollection](./index.html)

# SyncCollection

`class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/SyncCollection.kt#L26)

Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) to re-fresh
its content on every call, by doing round-trips to
the encapsulated iterable, use [StickyCollection](../-sticky-collection/index.html).

Objects of this class are thread-safe.

### Parameters

`T` - List type

**See Also**

[StickyCollection](../-sticky-collection/index.html)

**Since**
0.24

### Constructors

| [&lt;init&gt;](-init-.html) | `SyncCollection(src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.html#T)`>)`<br>`SyncCollection(vararg array: `[`T`](index.html#T)`)`<br>`SyncCollection(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`<br>`SyncCollection(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)` |

