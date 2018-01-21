[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [ListEnvelope](.)

# ListEnvelope

`open class ListEnvelope<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/ListEnvelope.kt#L14)

List envelope.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.23

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ListEnvelope(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<T>>)``ListEnvelope(list: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<T>>)`<br>List envelope. |

### Inheritors

| Name | Summary |
|---|---|
| [Joined](../-joined/index.md) | `class Joined<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<X>`<br>Joined list. |
| [ListOf](../-list-of/index.md) | `class ListOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<T>`<br>Iterable as [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [Mapped](../-mapped/index.md) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<Y>`<br>Mapped list. |
| [Shuffled](../-shuffled/index.md) | `class Shuffled<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<T>`<br>Shuffled list. |
| [SolidList](../-solid-list/index.md) | `class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<X>`<br>A [java.util.List](#) that is both synchronized and sticky. |
| [Sorted](../-sorted/index.md) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<T>> : ListEnvelope<T>`<br>Sorted list. |
| [StickyList](../-sticky-list/index.md) | `class StickyList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<X>`<br>List decorator that goes through the list only once. |
| [SyncList](../-sync-list/index.md) | `class SyncList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : ListEnvelope<X>`<br>Synchronized list. |
