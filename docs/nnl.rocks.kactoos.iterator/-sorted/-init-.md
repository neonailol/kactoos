[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Sorted](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Sorted(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`

If you're using this ctor you must be sure that type `T`
implements [Comparable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html) interface. Otherwise, there will be
a type casting exception in runtime.

### Parameters

`items` - The underlying iterator`Sorted(comparator: `[`Comparator`](http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)`<`[`T`](index.md#T)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`

Sorted iterator.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.7

