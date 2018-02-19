---
title: ListEnvelope - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.list](../index.html) / [ListEnvelope](./index.html)

# ListEnvelope

`open class ListEnvelope<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/ListEnvelope.kt#L14)

List envelope.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.23

### Constructors

| [&lt;init&gt;](-init-.html) | `ListEnvelope(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.html#T)`>>)``ListEnvelope(list: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.html#T)`>>)`<br>List envelope. |

### Inheritors

| [Joined](../-joined/index.html) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-joined/index.html#X)`>`<br>Joined list. |
| [ListOf](../-list-of/index.html) | `class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`T`](../-list-of/index.html#T)`>`<br>Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [Mapped](../-mapped/index.html) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`Y`](../-mapped/index.html#Y)`>`<br>Mapped list. |
| [Shuffled](../-shuffled/index.html) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`T`](../-shuffled/index.html#T)`>`<br>Shuffled list. |
| [SolidList](../-solid-list/index.html) | `class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-solid-list/index.html#X)`>`<br>A [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.html) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-sorted/index.html#T)`>> : `[`ListEnvelope`](./index.md)`<`[`T`](../-sorted/index.html#T)`>`<br>Sorted list. |
| [StickyList](../-sticky-list/index.html) | `class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-sticky-list/index.html#X)`>`<br>List decorator that goes through the list only once. |
| [SyncList](../-sync-list/index.html) | `class SyncList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-sync-list/index.html#X)`>`<br>Synchronized list. |

