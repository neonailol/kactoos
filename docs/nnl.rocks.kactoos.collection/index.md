---
title: nnl.rocks.kactoos.collection - kactoos-jvm
---

[kactoos-jvm](../index.html) / [nnl.rocks.kactoos.collection](./index.html)

## Package nnl.rocks.kactoos.collection

Collections.

### Types

| [CollectionEnvelope](-collection-envelope/index.html) | `open class CollectionEnvelope<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](-collection-envelope/index.html#X)`>`<br>Base read-only collection. |
| [CollectionNoNulls](-collection-no-nulls/index.html) | `class CollectionNoNulls<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableCollection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/index.html)`<`[`X`](-collection-no-nulls/index.html#X)`>`<br>A decorator of [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that tolerates no NULLs. |
| [CollectionOf](-collection-of/index.html) | `class CollectionOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`T`](-collection-of/index.html#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [Filtered](-filtered/index.html) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`X`](-filtered/index.html#X)`>`<br>Filtered collection. |
| [Joined](-joined/index.html) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`X`](-joined/index.html#X)`>`<br>Joined collection. |
| [Limited](-limited/index.html) | `class Limited<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`X`](-limited/index.html#X)`>`<br>Limited collection. |
| [Mapped](-mapped/index.html) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`Y`](-mapped/index.html#Y)`>`<br>Mapped collection. |
| [Reversed](-reversed/index.html) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`X`](-reversed/index.html#X)`>`<br>Reversed collection. |
| [Shuffled](-shuffled/index.html) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`T`](-shuffled/index.html#T)`>`<br>Sorted collection. |
| [Skipped](-skipped/index.html) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`T`](-skipped/index.html#T)`>`<br>Skipped collection. |
| [SolidCollection](-solid-collection/index.html) | `class SolidCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`T`](-solid-collection/index.html#T)`>`<br>A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that is both synchronized and sticky. |
| [Sorted](-sorted/index.html) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](-sorted/index.html#T)`>> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`T`](-sorted/index.html#T)`>`<br>Sorted collection. |
| [StickyCollection](-sticky-collection/index.html) | `class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`E`](-sticky-collection/index.html#E)`>`<br>Collection decorator that goes through the list only once. |
| [SyncCollection](-sync-collection/index.html) | `class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](-collection-envelope/index.html)`<`[`T`](-sync-collection/index.html#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |

