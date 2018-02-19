---
title: nnl.rocks.kactoos.iterable - kactoos-jvm
---

[kactoos-jvm](../index.html) / [nnl.rocks.kactoos.iterable](./index.html)

## Package nnl.rocks.kactoos.iterable

Iterables.

### Types

| [Cycled](-cycled/index.html) | `class Cycled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-cycled/index.html#T)`>`<br>Cycled Iterable. |
| [Endless](-endless/index.html) | `class Endless<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-endless/index.html#T)`>`<br>Endless iterable. |
| [Filtered](-filtered/index.html) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`X`](-filtered/index.html#X)`>`<br>Filtered iterable. |
| [IterableEnvelope](-iterable-envelope/index.html) | `open class IterableEnvelope<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](-iterable-envelope/index.html#X)`>`<br>Iterable envelope. |
| [IterableNoNulls](-iterable-no-nulls/index.html) | `class IterableNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableIterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterable/index.html)`<`[`X`](-iterable-no-nulls/index.html#X)`>`<br>A decorator for [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that doesn't allow any NULL. |
| [IterableOf](-iterable-of/index.html) | `class IterableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`X`](-iterable-of/index.html#X)`>`<br>Array as iterable. |
| [Joined](-joined/index.html) | `class Joined<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-joined/index.html#T)`>`<br>A few Iterables joined together. |
| [LengthOf](-length-of/index.html) | `class LengthOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.html)<br>Length of iterable. |
| [Limited](-limited/index.html) | `class Limited<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-limited/index.html#T)`>`<br>Limited iterable. |
| [Mapped](-mapped/index.html) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`Y`](-mapped/index.html#Y)`>`<br>Mapped iterable. |
| [Partitioned](-partitioned/index.html) | `class Partitioned<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](-partitioned/index.html#T)`>>`<br>Iterable implementation for partitioning functionality. |
| [RangeOf](-range-of/index.html) | `class RangeOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](-range-of/index.html#T)`>> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-range-of/index.html#T)`>`<br>Iterable implementation to model range functionality. |
| [Repeated](-repeated/index.html) | `class Repeated<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-repeated/index.html#T)`>`<br>Repeat an element. |
| [Reversed](-reversed/index.html) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`X`](-reversed/index.html#X)`>`<br>Reverse iterator. |
| [Shuffled](-shuffled/index.html) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-shuffled/index.html#T)`>`<br>Shuffled iterable. |
| [Skipped](-skipped/index.html) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-skipped/index.html#T)`>`<br>Skipped iterable. |
| [SolidIterable](-solid-iterable/index.html) | `class SolidIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`X`](-solid-iterable/index.html#X)`>`<br>An [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that is both synchronized and sticky. |
| [Sorted](-sorted/index.html) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](-sorted/index.html#T)`>> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`T`](-sorted/index.html#T)`>`<br>Sorted iterable. |
| [StickyIterable](-sticky-iterable/index.html) | `class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`X`](-sticky-iterable/index.html#X)`>`<br>Iterable that returns the same set of elements, always. |
| [SyncIterable](-sync-iterable/index.html) | `class SyncIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](-iterable-envelope/index.html)`<`[`X`](-sync-iterable/index.html#X)`>`<br>Synchronized iterable. |

