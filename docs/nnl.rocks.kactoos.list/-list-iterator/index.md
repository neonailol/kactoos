[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListIterator](./index.md)

# ListIterator

`class ListIterator<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>`

Iterator of the list.

There is no thread-safety guarantee.

### Parameters

`T` - Items type

`origin` - Original list iterator.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListIterator(orig: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>>)`<br>`ListIterator(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>)`<br>`ListIterator(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`ListIterator(iter: `[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>)``ListIterator(origin: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>>)`<br>Iterator of the list. |
