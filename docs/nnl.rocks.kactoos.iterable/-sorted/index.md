[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Sorted](./index.md)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.md#T)`>> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/Sorted.kt#L15)

Sorted iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.7

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.md#T)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`Sorted(vararg src: `[`T`](index.md#T)`)``Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime.`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.md#T)`>, vararg args: `[`T`](index.md#T)`)`<br>Ctor. |
