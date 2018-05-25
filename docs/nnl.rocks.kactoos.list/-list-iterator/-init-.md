[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListIterator](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ListIterator(orig: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>>)`
`ListIterator(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>)`
`ListIterator(iter: `[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>)``ListIterator(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>, index: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`list` - List that will be called to get a list iterator.

`index` - Start index for a newly created list iterator.`ListIterator(origin: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](index.md#T)`>>)`

Iterator of the list.

There is no thread-safety guarantee.

### Parameters

`T` - Items type

`origin` - Original list iterator.

**Since**
0.5

