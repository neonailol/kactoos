[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [IterableEnvelope](./index.md)

# IterableEnvelope

`open class IterableEnvelope<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>`

Iterable envelope.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IterableEnvelope(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>`IterableEnvelope(iterable: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>>)``IterableEnvelope(iterable: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>>)`<br>Iterable envelope. |

### Inheritors

| Name | Summary |
|---|---|
| [Cycled](../-cycled/index.md) | `class Cycled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-cycled/index.md#T)`>`<br>Cycled Iterable. |
| [Endless](../-endless/index.md) | `class Endless<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-endless/index.md#T)`>`<br>Endless iterable. |
| [Filtered](../-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-filtered/index.md#X)`>`<br>Filtered iterable. |
| [IterableOf](../-iterable-of/index.md) | `class IterableOf<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-iterable-of/index.md#X)`>`<br>Array as iterable. |
| [Joined](../-joined/index.md) | `class Joined<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-joined/index.md#T)`>`<br>A few Iterables joined together. |
| [Limited](../-limited/index.md) | `class Limited<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-limited/index.md#T)`>`<br>Limited iterable. |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`Y`](../-mapped/index.md#Y)`>`<br>Mapped iterable. |
| [Partitioned](../-partitioned/index.md) | `class Partitioned<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](../-partitioned/index.md#T)`>>`<br>Iterable implementation for partitioning functionality. |
| [RangeOf](../-range-of/index.md) | `class RangeOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-range-of/index.md#T)`>> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-range-of/index.md#T)`>`<br>Iterable implementation to model range functionality. |
| [Repeated](../-repeated/index.md) | `class Repeated<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-repeated/index.md#T)`>`<br>Repeat an element. |
| [Reversed](../-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-reversed/index.md#X)`>`<br>Reverse iterator. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-shuffled/index.md#T)`>`<br>Shuffled iterable. |
| [Skipped](../-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-skipped/index.md#T)`>`<br>Skipped iterable. |
| [SolidIterable](../-solid-iterable/index.md) | `class SolidIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-solid-iterable/index.md#X)`>`<br>An [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-sorted/index.md#T)`>> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-sorted/index.md#T)`>`<br>Sorted iterable. |
| [StickyIterable](../-sticky-iterable/index.md) | `class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-sticky-iterable/index.md#X)`>`<br>Iterable that returns the same set of elements, always. |
| [SyncIterable](../-sync-iterable/index.md) | `class SyncIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-sync-iterable/index.md#X)`>`<br>Synchronized iterable. |
