[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [StickyIterable](.)

# StickyIterable

`class StickyIterable<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/StickyIterable.kt#L18)

Iterable that returns the same set of elements, always.

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyIterable(vararg src: X)`<br>Ctor.`StickyIterable(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`<br>Iterable that returns the same set of elements, always. |
