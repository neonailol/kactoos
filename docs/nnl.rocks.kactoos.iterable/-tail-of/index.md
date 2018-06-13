[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [TailOf](./index.md)

# TailOf

`class TailOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`T`](index.md#T)`>`

Tail portion of the iterable.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

`num` - Number of tail elements

`iterable` - Decorated iterable

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TailOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, vararg args: `[`T`](index.md#T)`)``TailOf(num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>Tail portion of the iterable. |
