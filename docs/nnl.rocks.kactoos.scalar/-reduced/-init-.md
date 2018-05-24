[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Reduced](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Reduced(function: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`, `[`T`](index.md#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>)``Reduced(function: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`, `[`T`](index.md#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>)`

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

