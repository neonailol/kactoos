[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [Grouped](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Grouped(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, keys: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`T`](index.md#T)`, `[`K`](index.md#K)`>, values: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`T`](index.md#T)`, `[`V`](index.md#V)`>)`

Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

This class groups objects from iterable by applying functions for keys and values

There is no thread-safety guarantee.

### Parameters

`K` - Type of key

`V` - Type of value

`T` - Type of entry objects of functions

`list` - Iterable which is used to retrieve data from

`keys` - Function to get a key

`values` - Function to get a value

**Since**
0.3

