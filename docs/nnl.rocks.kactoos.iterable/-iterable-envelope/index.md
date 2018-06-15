[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [IterableEnvelope](./index.md)

# IterableEnvelope

`open class IterableEnvelope<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>`

Iterable envelope.

There is no thread-safety guarantee.

### Parameters

`T` - Type of item

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IterableEnvelope(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`IterableEnvelope(iterable: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>>)``IterableEnvelope(iterable: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>>)`<br>Iterable envelope. |

### Functions

| Name | Summary |
|---|---|
| [iterator](iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>` |

### Inheritors

| Name | Summary |
|---|---|
| [Cycled](../-cycled/index.md) | `class Cycled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-cycled/index.md#T)`>`<br>Cycled Iterable. |
| [Endless](../-endless/index.md) | `class Endless<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-endless/index.md#T)`>`<br>Endless iterable. |
| [Filtered](../-filtered/index.md) | `class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-filtered/index.md#X)`>`<br>Filtered iterable. |
| [HeadOf](../-head-of/index.md) | `class HeadOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-head-of/index.md#T)`>`<br>Head portion of the iterable. |
| [IterableOf](../-iterable-of/index.md) | `class IterableOf<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-iterable-of/index.md#T)`>`<br>Array as iterable. |
| [IterableOfBooleans](../-iterable-of-booleans/index.md) | `class IterableOfBooleans : `[`IterableEnvelope`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Iterable of boolean values. |
| [IterableOfBytes](../-iterable-of-bytes/index.md) | `class IterableOfBytes : `[`IterableEnvelope`](./index.md)`<`[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html)`>`<br>Iterable of bytes. |
| [IterableOfChars](../-iterable-of-chars/index.md) | `class IterableOfChars : `[`IterableEnvelope`](./index.md)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>Iterable of characters. |
| [IterableOfDoubles](../-iterable-of-doubles/index.md) | `class IterableOfDoubles : `[`IterableEnvelope`](./index.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Iterable of double values. |
| [IterableOfFloats](../-iterable-of-floats/index.md) | `class IterableOfFloats : `[`IterableEnvelope`](./index.md)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>`<br>Iterable of float values. |
| [IterableOfInts](../-iterable-of-ints/index.md) | `class IterableOfInts : `[`IterableEnvelope`](./index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`<br>Iterable of integer values. |
| [IterableOfLongs](../-iterable-of-longs/index.md) | `class IterableOfLongs : `[`IterableEnvelope`](./index.md)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`<br>Iterable of long values. |
| [IterableOfShorts](../-iterable-of-shorts/index.md) | `class IterableOfShorts : `[`IterableEnvelope`](./index.md)`<`[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html)`>`<br>Iterable of short values. |
| [Joined](../-joined/index.md) | `class Joined<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-joined/index.md#T)`>`<br>A few Iterables joined together. |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`Y`](../-mapped/index.md#Y)`>`<br>Mapped iterable. |
| [Partitioned](../-partitioned/index.md) | `class Partitioned<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](../-partitioned/index.md#T)`>>`<br>Iterable implementation for partitioning functionality. |
| [RangeOf](../-range-of/index.md) | `class RangeOf<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-range-of/index.md#T)`>> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-range-of/index.md#T)`>`<br>Iterable implementation to model range functionality. |
| [Repeated](../-repeated/index.md) | `class Repeated<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-repeated/index.md#T)`>`<br>Repeat an element. |
| [Reversed](../-reversed/index.md) | `class Reversed<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-reversed/index.md#X)`>`<br>Reverse iterable. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-shuffled/index.md#T)`>`<br>Shuffled iterable. |
| [Skipped](../-skipped/index.md) | `class Skipped<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-skipped/index.md#T)`>`<br>Skipped iterable. |
| [SolidIterable](../-solid-iterable/index.md) | `class SolidIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-solid-iterable/index.md#X)`>`<br>An [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-sorted/index.md#T)`>`<br>Sorted iterable. |
| [StickyIterable](../-sticky-iterable/index.md) | `class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`X`](../-sticky-iterable/index.md#X)`>`<br>Iterable that returns the same set of elements, always. |
| [TailOf](../-tail-of/index.md) | `class TailOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](./index.md)`<`[`T`](../-tail-of/index.md#T)`>`<br>Tail portion of the iterable. |
