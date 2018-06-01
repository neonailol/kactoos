[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.collection](./index.md)

## Package nnl.rocks.kactoos.collection

Collections.

### Types

| Name | Summary |
|---|---|
| [CollectionEnvelope](-collection-envelope/index.md) | `open class CollectionEnvelope<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](-collection-envelope/index.md#X)`>`<br>Base read-only collection. |
| [CollectionNoNulls](-collection-no-nulls/index.md) | `class CollectionNoNulls<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](-collection-no-nulls/index.md#X)`>`<br>A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs. |
| [CollectionOf](-collection-of/index.md) | `class CollectionOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-collection-of/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [Filtered](-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`X`](-filtered/index.md#X)`>`<br>Filtered collection. |
| [HeadOf](-head-of/index.md) | `class HeadOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-head-of/index.md#T)`>`<br>Head portion of collection. |
| [Joined](-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`X`](-joined/index.md#X)`>`<br>Joined collection. |
| [Mapped](-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`Y`](-mapped/index.md#Y)`>`<br>Mapped collection. |
| [Reversed](-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`X`](-reversed/index.md#X)`>`<br>Reversed collection. |
| [Shuffled](-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-shuffled/index.md#T)`>`<br>Shuffled collection. |
| [Skipped](-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-skipped/index.md#T)`>`<br>Skipped collection. |
| [SolidCollection](-solid-collection/index.md) | `class SolidCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-solid-collection/index.md#T)`>`<br>A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that is both synchronized and sticky. |
| [Sorted](-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](-sorted/index.md#T)`>> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-sorted/index.md#T)`>`<br>Sorted collection. |
| [StickyCollection](-sticky-collection/index.md) | `class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`E`](-sticky-collection/index.md#E)`>`<br>Collection decorator that goes through the list only once. |
| [SyncCollection](-sync-collection/index.md) | `class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-sync-collection/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [TailOf](-tail-of/index.md) | `class TailOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-tail-of/index.md#T)`>`<br>Tail portion of the collection. |
