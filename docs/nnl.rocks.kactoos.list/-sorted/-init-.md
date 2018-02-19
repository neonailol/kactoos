[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Sorted](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.md#T)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)``Sorted(vararg src: `[`T`](index.md#T)`)`

### Parameters

`src` - The underlying collection`Sorted(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`

If you're using this ctor you must be sure that type `T`
implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be
a type casting exception in runtime.

### Parameters

`src` - The underlying collection

**Since**
0.21

`Sorted(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`

If you're using this ctor you must be sure that type `T`
implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be
a type casting exception in runtime.

### Parameters

`src` - The underlying collection`Sorted(cmp: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.md#T)`>, vararg src: `[`T`](index.md#T)`)`

### Parameters

`src` - The underlying collection

`cmp` - The comparator