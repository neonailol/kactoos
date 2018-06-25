[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListOf](./index.md)

# ListOf

`class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`T`](index.md#T)`>`

Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html).

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) on each
method call. It doesn't cache the data anyhow. If you don't need this [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)
to re-fresh its content on every call, by doing round-trips to the
encapsulated iterable, decorate it with [StickyList](../-sticky-list/index.md).

There is no thread-safety guarantee.

### Parameters

`T` - List type

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListOf(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`ListOf(vararg args: `[`T`](index.md#T)`)` |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-list-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-list-envelope/index.md#T)`>` |
| [listIterator](../-list-envelope/list-iterator.md) | `open fun listIterator(): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>`<br>`open fun listIterator(index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`ListIterator`](../-list-iterator/index.md)`<`[`T`](../-list-envelope/index.md#T)`>` |
