[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Folded](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Folded(function: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`, `[`T`](index.md#T)`>, items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>>)`

Folds iterable via BiFunc.

```
new Folded<>(
(first, last) -> first + last,
new IterableOf<>(() -> 1L, () -> 2L, () -> 3L, () -> 4L)
).value() // returns 10L
```

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

### Parameters

`T` - Scalar type

`function` - Folding function

`items` - The scalars

**Since**
0.3

