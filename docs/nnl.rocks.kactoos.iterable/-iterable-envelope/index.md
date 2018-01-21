[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [IterableEnvelope](.)

# IterableEnvelope

`open class IterableEnvelope<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/IterableEnvelope.kt#L17)

Iterable envelope.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IterableEnvelope(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>>)``IterableEnvelope(iterable: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>>)`<br>Iterable envelope. |

### Inheritors

| Name | Summary |
|---|---|
| [Cycled](../-cycled/index.md) | `class Cycled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>Cycled Iterable. |
| [Endless](../-endless/index.md) | `class Endless<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>Endless iterable. |
| [Filtered](../-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<X>`<br>Filtered iterable. |
| [IterableOf](../-iterable-of/index.md) | `class IterableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<X>`<br>Array as iterable. |
| [Joined](../-joined/index.md) | `class Joined<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>A few Iterables joined together. |
| [Limited](../-limited/index.md) | `class Limited<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>Limited iterable. |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<Y>`<br>Mapped iterable. |
| [Partitioned](../-partitioned/index.md) | `class Partitioned<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<T>>`<br>Iterable implementation for partitioning functionality. |
| [RangeOf](../-range-of/index.md) | `class RangeOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : IterableEnvelope<T>`<br>Iterable implementation to model range functionality. |
| [Repeated](../-repeated/index.md) | `class Repeated<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>Repeat an element. |
| [Reversed](../-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<X>`<br>Reverse iterator. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>Shuffled iterable. |
| [Skipped](../-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<T>`<br>Skipped iterable. |
| [SolidIterable](../-solid-iterable/index.md) | `class SolidIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<X>`<br>An [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : IterableEnvelope<T>`<br>Sorted iterable. |
| [StickyIterable](../-sticky-iterable/index.md) | `class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<X>`<br>Iterable that returns the same set of elements, always. |
| [SyncIterable](../-sync-iterable/index.md) | `class SyncIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : IterableEnvelope<X>`<br>Synchronized iterable. |
