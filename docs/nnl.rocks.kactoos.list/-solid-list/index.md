[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [SolidList](./index.md)

# SolidList

`class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<`[`X`](index.md#X)`>`

A [java.util.List](http://docs.oracle.com/javase/8/docs/api/java/util/List.html) that is both synchronized and sticky.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SolidList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.md#X)`>)`<br>`SolidList(vararg items: `[`X`](index.md#X)`)`<br>`SolidList(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.md#X)`>)`<br>`SolidList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.md#X)`>)` |
