[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Limited](.)

# Limited

`class Limited<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/Limited.kt#L21)

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
| [&lt;init&gt;](-init-.md) | `Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg itr: T)`<br>`Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, itr: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>)``Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, itr: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`<br>Limited iterable. |
