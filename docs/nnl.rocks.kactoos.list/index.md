[kactoos-jvm](../index.md) / [nnl.rocks.kactoos.list](.)

## Package nnl.rocks.kactoos.list

Lists.

### Types

| Name | Summary |
|---|---|
| [Joined](-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<X>`<br>Joined list. |
| [ListEnvelope](-list-envelope/index.md) | `open class ListEnvelope<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<T>`<br>List envelope. |
| [ListNoNulls](-list-no-nulls/index.md) | `class ListNoNulls<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableList`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/index.html)`<T>`<br>A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs. |
| [ListOf](-list-of/index.md) | `class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<T>`<br>Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [Mapped](-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<Y>`<br>Mapped list. |
| [Shuffled](-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<T>`<br>Shuffled list. |
| [SolidList](-solid-list/index.md) | `class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<X>`<br>A [java.util.List](#) that is both synchronized and sticky. |
| [Sorted](-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : `[`ListEnvelope`](-list-envelope/index.md)`<T>`<br>Sorted list. |
| [StickyList](-sticky-list/index.md) | `class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<X>`<br>List decorator that goes through the list only once. |
| [SyncList](-sync-list/index.md) | `class SyncList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](-list-envelope/index.md)`<X>`<br>Synchronized list. |
