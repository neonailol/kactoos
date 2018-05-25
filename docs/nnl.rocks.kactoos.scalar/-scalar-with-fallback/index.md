[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [ScalarWithFallback](./index.md)

# ScalarWithFallback

`class ScalarWithFallback<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](index.md#T)`>> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>`

Scalar with a fallback plan.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`origin` - Original scalar

`fallbacks` - Fallbacks

`follow` - Follow up function

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ScalarWithFallback(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>, fallbacks: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`FallbackFrom`](../-fallback-from/index.md)`<`[`T`](index.md#T)`>>, follow: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`T`](index.md#T)`, `[`T`](index.md#T)`>)`<br>Scalar with a fallback plan. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
