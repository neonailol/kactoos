[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [SyncIterable](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SyncIterable(vararg src: `[`X`](index.md#X)`)``SyncIterable(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)` = Any())`

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

`origin` - The iterable synchronize access to.

`lock` - The lock to synchronize with.

**Since**
0.5

