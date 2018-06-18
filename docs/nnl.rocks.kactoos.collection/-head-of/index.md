[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [HeadOf](./index.md)

# HeadOf

`class HeadOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`T`](index.md#T)`>`

Head portion of collection.

There is no thread-safety guarantee.

### Parameters

`T` - Type of source item

`num` - Number of head elements

`src` - Source collection

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `HeadOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg src: `[`T`](index.md#T)`)`<br>`HeadOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)``HeadOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`T`](index.md#T)`>)`<br>Head portion of collection. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
