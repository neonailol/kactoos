[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [SyncIterable](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`SyncIterable(vararg src: X)`

### Parameters

`src` - The underlying iterable`SyncIterable(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`

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

