[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [SyncList](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SyncList(vararg items: `[`X`](index.md#X)`)`
`SyncList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`

### Parameters

`items` - The array`SyncList(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)`

### Parameters

`items` - The array

**Since**
0.21

`SyncList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`

Synchronized list.

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) to re-fresh
its content on every call, by doing round-trips to
the encapsulated iterable, use [StickyList](../-sticky-list/index.md).

The list is read only.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.24

