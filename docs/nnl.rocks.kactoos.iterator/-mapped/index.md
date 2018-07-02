[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Mapped](./index.md)

# Mapped

`class Mapped<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Y`](index.md#Y)`>`

Mapped iterator.

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

`Y` - Type of target item

`func` - Mapping function

`origin` - Decorated iterator

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Mapped(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, origin: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)``Mapped(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, origin: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)`<br>Mapped iterator. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`Y`](index.md#Y) |
