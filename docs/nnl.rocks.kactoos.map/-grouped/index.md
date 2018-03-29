[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [Grouped](./index.md)

# Grouped

`class Grouped<K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](../-map-envelope/index.md)`<`[`K`](index.md#K)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`V`](index.md#V)`>>`

Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

This class groups objects from iterable by applying
functions for keys and values

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Grouped(list: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, keys: `[`Function`](http://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)`<`[`T`](index.md#T)`, `[`K`](index.md#K)`>, values: `[`Function`](http://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)`<`[`T`](index.md#T)`, `[`V`](index.md#V)`>)`<br>Iterable as [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
