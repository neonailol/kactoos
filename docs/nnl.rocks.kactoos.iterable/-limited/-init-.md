[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Limited](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg itr: T)`

### Parameters

`lmt` - The requested number of elements

`itr` - The underlying iterable

**Since**
0.23

`Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, itr: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<T>)`

### Parameters

`lmt` - The requested number of elements

`itr` - The underlying iterable`Limited(lmt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, itr: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<T>)`

Limited iterable.

This is a view of an existing iterable containing the given number of its
first elements.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.6

