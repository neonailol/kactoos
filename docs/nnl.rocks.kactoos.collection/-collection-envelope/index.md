[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [CollectionEnvelope](./index.md)

# CollectionEnvelope

`open class CollectionEnvelope<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>`

Base read-only collection.

There is no thread-safety guarantee.

### Parameters

`X` - Element type.

`collection` - Encapsulated collection.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CollectionEnvelope(collection: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`<br>`CollectionEnvelope(collection: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>>)``CollectionEnvelope(collection: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>>)`<br>Base read-only collection. |

### Functions

| Name | Summary |
|---|---|
| [iterator](iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>` |

### Inheritors

| Name | Summary |
|---|---|
| [CollectionOf](../-collection-of/index.md) | `class CollectionOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-collection-of/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [Filtered](../-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-filtered/index.md#X)`>`<br>Filtered collection. |
| [HeadOf](../-head-of/index.md) | `class HeadOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-head-of/index.md#T)`>`<br>Head portion of collection. |
| [Joined](../-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-joined/index.md#X)`>`<br>A few Collections joined together. |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`Y`](../-mapped/index.md#Y)`>`<br>Mapped collection. |
| [Reversed](../-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-reversed/index.md#X)`>`<br>Reversed collection. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-shuffled/index.md#T)`>`<br>Shuffled collection. |
| [Skipped](../-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-skipped/index.md#T)`>`<br>Skipped collection. |
| [SolidCollection](../-solid-collection/index.md) | `class SolidCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-solid-collection/index.md#T)`>`<br>A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-sorted/index.md#T)`>`<br>Sorted collection. |
| [StickyCollection](../-sticky-collection/index.md) | `class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`E`](../-sticky-collection/index.md#E)`>`<br>Collection decorator that goes through the list only once. |
| [SyncCollection](../-sync-collection/index.md) | `class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-sync-collection/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [TailOf](../-tail-of/index.md) | `class TailOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-tail-of/index.md#T)`>`<br>Tail portion of the collection. |
