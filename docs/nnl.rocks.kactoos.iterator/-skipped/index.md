[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Skipped](./index.md)

# Skipped

`class Skipped<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/Skipped.kt#L15)

Skipped iterator.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.8

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Skipped(omit: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, origin: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>Skipped iterator. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`T`](index.md#T) |
