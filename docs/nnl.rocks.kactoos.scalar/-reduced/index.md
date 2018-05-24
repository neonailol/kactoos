[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Reduced](./index.md)

# Reduced

`class Reduced<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>`

Reduce iterable via BiFunc.

```
Reduced(
{ head, tail -> head + tail },
IterableOf({ 1 }, { 2 }, { 3 }, { 4 })
).invoke()
```

There is no thread-safety guarantee.

### Parameters

`T` - KScalar type

`function` - Folding function

`items` - The scalars

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Reduced(function: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`, `[`T`](index.md#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>)``Reduced(function: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`, `[`T`](index.md#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>)`<br>Reduce iterable via BiFunc. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T) |
