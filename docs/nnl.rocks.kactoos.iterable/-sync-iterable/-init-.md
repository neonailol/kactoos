[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [SyncIterable](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SyncIterable(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`
`SyncIterable(vararg src: `[`X`](index.md#X)`)``SyncIterable(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`

Synchronized iterable.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item.

`origin` - The iterable synchronize access to.

`lock` - The lock to synchronize with.

**Since**
0.4

**See Also**

[StickyIterable](../-sticky-iterable/index.md)

[SolidIterable](../-solid-iterable/index.md)

