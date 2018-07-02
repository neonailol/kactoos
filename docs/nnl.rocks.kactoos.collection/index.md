[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.collection](./index.md)

## Package nnl.rocks.kactoos.collection

Collections.

### Types

| Name | Summary |
|---|---|
| [CollectionEnvelope](-collection-envelope/index.md) | `open class CollectionEnvelope<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](-collection-envelope/index.md#X)`>`<br>Base read-only collection. |
| [CollectionNoNulls](-collection-no-nulls/index.md) | `class CollectionNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](-collection-no-nulls/index.md#X)`>`<br>A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs. |
| [CollectionOf](-collection-of/index.md) | `class CollectionOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-collection-of/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [Filtered](-filtered/index.md) | `class Filtered<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`X`](-filtered/index.md#X)`>`<br>Filtered collection. |
| [HeadOf](-head-of/index.md) | `class HeadOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-head-of/index.md#T)`>`<br>Head portion of collection. |
| [Joined](-joined/index.md) | `class Joined<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`X`](-joined/index.md#X)`>`<br>A few Collections joined together. |
| [Mapped](-mapped/index.md) | `class Mapped<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`Y`](-mapped/index.md#Y)`>`<br>Mapped collection. |
| [Reversed](-reversed/index.md) | `class Reversed<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`X`](-reversed/index.md#X)`>`<br>Reversed collection. |
| [Shuffled](-shuffled/index.md) | `class Shuffled<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-shuffled/index.md#T)`>`<br>Shuffled collection. |
| [Skipped](-skipped/index.md) | `class Skipped<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-skipped/index.md#T)`>`<br>Skipped collection. |
| [SolidCollection](-solid-collection/index.md) | `class SolidCollection<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-solid-collection/index.md#T)`>`<br>A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that is both synchronized and sticky. |
| [Sorted](-sorted/index.md) | `class Sorted<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-sorted/index.md#T)`>`<br>Sorted collection. |
| [StickyCollection](-sticky-collection/index.md) | `class StickyCollection<out E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`E`](-sticky-collection/index.md#E)`>`<br>Collection decorator that goes through the list only once. |
| [SyncCollection](-sync-collection/index.md) | `class SyncCollection<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-sync-collection/index.md#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [TailOf](-tail-of/index.md) | `class TailOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.md)`<`[`T`](-tail-of/index.md#T)`>`<br>Tail portion of the collection. |
