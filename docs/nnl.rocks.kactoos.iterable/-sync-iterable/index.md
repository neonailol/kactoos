[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [SyncIterable](./index.md)

# SyncIterable

`class SyncIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`X`](index.md#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/SyncIterable.kt#L25)

Synchronized iterable.

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) to re-fresh
its content on every call, by doing round-trips to
the encapsulated iterable, use [StickyIterable](../-sticky-iterable/index.md).

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncIterable(vararg src: `[`X`](index.md#X)`)``SyncIterable(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>Synchronized iterable. |
