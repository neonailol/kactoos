[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Sorted](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`Sorted(cmp: Comparator<T>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)``Sorted(vararg src: T)`

### Parameters

`src` - The underlying iterable`Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`

If you're using this ctor you must be sure that type `T`
implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be
a type casting exception in runtime.

### Parameters

`src` - The underlying iterable`Sorted(cmp: Comparator<T>, vararg args: T)`

Ctor.

### Parameters

`args` - The underlying iterable

`cmp` - The comparator