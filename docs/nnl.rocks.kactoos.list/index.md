[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.list](./index.md)

## Package nnl.rocks.kactoos.list

Lists.

### Types

| Name | Summary |
|---|---|
| [Joined](-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`X`](-joined/index.md#X)`>`<br>Joined list. |
| [ListEnvelope](-list-envelope/index.md) | `open class ListEnvelope<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](-list-envelope/index.md#T)`>`<br>List envelope. |
| [ListIterator](-list-iterator/index.md) | `class ListIterator<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator/index.html)`<`[`T`](-list-iterator/index.md#T)`>`<br>Iterator of the list. |
| [ListNoNulls](-list-no-nulls/index.md) | `class ListNoNulls<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<`[`T`](-list-no-nulls/index.md#T)`>`<br>A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs. |
| [ListOf](-list-of/index.md) | `class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`T`](-list-of/index.md#T)`>`<br>Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [Mapped](-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`Y`](-mapped/index.md#Y)`>`<br>Mapped list. |
| [Shuffled](-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`T`](-shuffled/index.md#T)`>`<br>Shuffled list. |
| [SolidList](-solid-list/index.md) | `class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`X`](-solid-list/index.md#X)`>`<br>A [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) that is both synchronized and sticky. |
| [Sorted](-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](-sorted/index.md#T)`>> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`T`](-sorted/index.md#T)`>`<br>Sorted list. |
| [StickyList](-sticky-list/index.md) | `class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`X`](-sticky-list/index.md#X)`>`<br>List decorator that goes through the list only once. |
| [SyncList](-sync-list/index.md) | `class SyncList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<`[`X`](-sync-list/index.md#X)`>`<br>Synchronized list. |
