[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Filtered](./index.md)

# Filtered

`class Filtered<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<`[`X`](index.md#X)`>`

Filtered iterable.

You can use it in order to create a declarative/lazy
version of a filtered collection/iterable. For example,
this code will create a list of two strings "red" and "fox":

```
val filtered = Filtered(
    { input -> input.length < 4 },
    IterableOf("red", "lazy", "fox")
)
```

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

`fnc` - Predicate

`src` - Source

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Filtered(fnc: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.md#X)`)`<br>`Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)``Filtered(fnc: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>Filtered iterable. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-iterable-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](../-iterable-envelope/index.md#T)`>` |
