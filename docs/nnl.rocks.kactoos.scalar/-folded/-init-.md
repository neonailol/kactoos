[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Folded](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Folded(function: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`, `[`T`](index.md#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>>)`

Folds iterable via BiFunc.

```
new Folded<>(
(first, last) -> first + last,
new IterableOf<>(() -> 1L, () -> 2L, () -> 3L, () -> 4L)
).value() // returns 10L
```

There is no thread-safety guarantee.

### Parameters

`T` - KScalar type

`function` - Folding function

`items` - The scalars

**Since**
0.3

