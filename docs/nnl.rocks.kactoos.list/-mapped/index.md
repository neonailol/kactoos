[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.list](../index.md) / [Mapped](.)

# Mapped

`class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`ListEnvelope`](../-list-envelope/index.md)`<Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/list/Mapped.kt#L18)

Mapped list.

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

`Y` - Type of target item

**Since**
0.14

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`<br>`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)``Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<X>)`<br>Mapped list. |
