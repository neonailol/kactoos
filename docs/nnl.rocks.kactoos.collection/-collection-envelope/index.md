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

### Inheritors

| Name | Summary |
|---|---|
| [CollectionOf](../-collection-of/index.md) | `class CollectionOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-collection-of/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [Filtered](../-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-filtered/index.md#X)`>`<br>Filtered collection. |
| [Joined](../-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-joined/index.md#X)`>`<br>Joined collection. |
| [Limited](../-limited/index.md) | `class Limited<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-limited/index.md#X)`>`<br>Limited collection. |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`Y`](../-mapped/index.md#Y)`>`<br>Mapped collection. |
| [Reversed](../-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-reversed/index.md#X)`>`<br>Reversed collection. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-shuffled/index.md#T)`>`<br>Sorted collection. |
| [Skipped](../-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-skipped/index.md#T)`>`<br>Skipped collection. |
| [SolidCollection](../-solid-collection/index.md) | `class SolidCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-solid-collection/index.md#T)`>`<br>A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-sorted/index.md#T)`>> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-sorted/index.md#T)`>`<br>Sorted collection. |
| [StickyCollection](../-sticky-collection/index.md) | `class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`E`](../-sticky-collection/index.md#E)`>`<br>Collection decorator that goes through the list only once. |
| [SyncCollection](../-sync-collection/index.md) | `class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-sync-collection/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
