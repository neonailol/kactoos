---
title: CollectionEnvelope - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.collection](../index.html) / [CollectionEnvelope](./index.html)

# CollectionEnvelope

`open class CollectionEnvelope<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/CollectionEnvelope.kt#L15)

Base read-only collection.

There is no thread-safety guarantee.

### Parameters

`X` - Element type.

`col` - Encapsulated collection.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `CollectionEnvelope(slr: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>>)``CollectionEnvelope(col: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>>)`<br>Base read-only collection. |

### Inheritors

| [CollectionOf](../-collection-of/index.html) | `class CollectionOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-collection-of/index.html#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |
| [Filtered](../-filtered/index.html) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-filtered/index.html#X)`>`<br>Filtered collection. |
| [Joined](../-joined/index.html) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-joined/index.html#X)`>`<br>Joined collection. |
| [Limited](../-limited/index.html) | `class Limited<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-limited/index.html#X)`>`<br>Limited collection. |
| [Mapped](../-mapped/index.html) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`Y`](../-mapped/index.html#Y)`>`<br>Mapped collection. |
| [Reversed](../-reversed/index.html) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`X`](../-reversed/index.html#X)`>`<br>Reversed collection. |
| [Shuffled](../-shuffled/index.html) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-shuffled/index.html#T)`>`<br>Sorted collection. |
| [Skipped](../-skipped/index.html) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-skipped/index.html#T)`>`<br>Skipped collection. |
| [SolidCollection](../-solid-collection/index.html) | `class SolidCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-solid-collection/index.html#T)`>`<br>A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.html) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-sorted/index.html#T)`>> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-sorted/index.html#T)`>`<br>Sorted collection. |
| [StickyCollection](../-sticky-collection/index.html) | `class StickyCollection<E : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`E`](../-sticky-collection/index.html#E)`>`<br>Collection decorator that goes through the list only once. |
| [SyncCollection](../-sync-collection/index.html) | `class SyncCollection<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](./index.md)`<`[`T`](../-sync-collection/index.html#T)`>`<br>Iterable as [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). |

