[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.collection](../index.md) / [Mapped](./index.md)

# Mapped

`class Mapped<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.md)`<`[`Y`](index.md#Y)`>`

Mapped collection.

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

`Y` - Type of target item

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Mapped(fnc: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>`Mapped(fnc: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, vararg src: `[`X`](index.md#X)`)`<br>`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)`<br>`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, vararg src: `[`X`](index.md#X)`)``Mapped(fnc: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`<br>Mapped collection. |

### Inherited Functions

| Name | Summary |
|---|---|
| [iterator](../-collection-envelope/iterator.md) | `open fun iterator(): `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](../-collection-envelope/index.md#X)`>` |
