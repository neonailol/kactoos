[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Limited](./index.md)

# Limited

`class Limited<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Limited iterable.

This is a view of an existing iterable containing the given number of its
first elements.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.6

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg itr: `[`T`](index.md#T)`)`<br>`Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, itr: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)``Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, itr: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Limited iterable. |
