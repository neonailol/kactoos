[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Endless](./index.md)

# Endless

`class Endless<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/Endless.kt#L18)

Iterator that never ends.

If you need to repeat certain amount of time, use [Repeated](../-repeated/index.md).

### Parameters

`T` - Element type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Endless(element: `[`T`](index.md#T)`)`<br>`Endless(scalar: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)`<br>Ctor.`Endless(origin: `[`UncheckedScalar`](../../nnl.rocks.kactoos.scalar/-unchecked-scalar/index.md)`<`[`T`](index.md#T)`>)`<br>Iterator that never ends. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`T`](index.md#T) |
