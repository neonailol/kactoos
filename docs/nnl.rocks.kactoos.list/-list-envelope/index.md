[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListEnvelope](./index.md)

# ListEnvelope

`open class ListEnvelope<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>`

List envelope.

There is no thread-safety guarantee.

### Parameters

`T` - Element type.

`list` - Encapsulated list.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListEnvelope(list: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>)`<br>`ListEnvelope(list: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>>)``ListEnvelope(list: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](index.md#T)`>>)`<br>List envelope. |

### Inheritors

| Name | Summary |
|---|---|
| [Joined](../-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-joined/index.md#X)`>`<br>Joined list. |
| [ListNoNulls](../-list-no-nulls/index.md) | `class ListNoNulls<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`T`](../-list-no-nulls/index.md#T)`>`<br>A decorator of [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that tolerates no NULLs. |
| [ListOf](../-list-of/index.md) | `class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`T`](../-list-of/index.md#T)`>`<br>Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`Y`](../-mapped/index.md#Y)`>`<br>Mapped list. |
| [Reversed](../-reversed/index.md) | `class Reversed<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`T`](../-reversed/index.md#T)`>`<br>Reversed list. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`T`](../-shuffled/index.md#T)`>`<br>Shuffled list. |
| [SolidList](../-solid-list/index.md) | `class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-solid-list/index.md#X)`>`<br>A [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](../-sorted/index.md#T)`>> : `[`ListEnvelope`](./index.md)`<`[`T`](../-sorted/index.md#T)`>`<br>Sorted list. |
| [StickyList](../-sticky-list/index.md) | `class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-sticky-list/index.md#X)`>`<br>List decorator that goes through the list only once. |
| [SyncList](../-sync-list/index.md) | `class SyncList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](./index.md)`<`[`X`](../-sync-list/index.md#X)`>`<br>Synchronized list. |
