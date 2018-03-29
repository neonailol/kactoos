[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListNoNulls](./index.md)

# ListNoNulls

`class ListNoNulls<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>`

A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListNoNulls(lst: `[`ListEnvelope`](../-list-envelope/index.md)`<`[`T`](index.md#T)`>)``ListNoNulls(list: `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](index.md#T)`>)`<br>A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs. |
