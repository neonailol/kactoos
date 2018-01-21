[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Sorted](.)

# Sorted

`class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/Sorted.kt#L15)

Sorted iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.7

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Sorted(cmp: Comparator<T>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`<br>`Sorted(vararg src: T)``Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`<br>If you're using this ctor you must be sure that type `T` implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be a type casting exception in runtime.`Sorted(cmp: Comparator<T>, vararg args: T)`<br>Ctor. |
