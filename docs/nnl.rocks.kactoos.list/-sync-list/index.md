[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [SyncList](.)

# SyncList

`class SyncList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/SyncList.kt#L28)

Synchronized list.

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [java.util.List](#) to re-fresh
its content on every call, by doing round-trips to
the encapsulated iterable, use [StickyList](../-sticky-list/index.md).

The list is read only.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncList(vararg items: X)`<br>`SyncList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`<br>`SyncList(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)``SyncList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<X>)`<br>Synchronized list. |
