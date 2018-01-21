[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [SolidList](.)

# SolidList

`class SolidList<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/SolidList.kt#L19)

A [java.util.List](#) that is both synchronized and sticky.

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.24

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SolidList(vararg items: X)`<br>`SolidList(items: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`<br>`SolidList(items: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)``SolidList(list: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<X>)`<br>A [java.util.List](#) that is both synchronized and sticky. |
