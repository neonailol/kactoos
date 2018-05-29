[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [CollectionNoNulls](./index.md)

# CollectionNoNulls

`class CollectionNoNulls<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>`

A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs.

There is no thread-safety guarantee.

### Parameters

`X` - Element type

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CollectionNoNulls(col: `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`X`](index.md#X)`>)`<br>`CollectionNoNulls(col: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)``CollectionNoNulls(col: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>>)`<br>A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs. |

### Functions

| Name | Summary |
|---|---|
| [iterator](iterator.md) | `fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>` |
