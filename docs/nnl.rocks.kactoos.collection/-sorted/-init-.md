[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Sorted](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`Sorted(cmp: Comparator<T>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<T>)``Sorted(vararg src: T)`

### Parameters

`src` - The underlying collection`Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`

If you're using this ctor you must be sure that type `T`
implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be
a type casting exception in runtime.

### Parameters

`src` - The underlying collection`Sorted(cmp: Comparator<T>, vararg src: T)`
`Sorted(cmp: Comparator<T>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`

### Parameters

`src` - The underlying collection

`cmp` - The comparator`Sorted(cmp: Comparator<T>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>)`

### Parameters

`src` - The underlying collection

`cmp` - The comparator

**Since**
0.23

