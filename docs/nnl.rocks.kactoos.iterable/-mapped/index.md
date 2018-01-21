[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Mapped](.)

# Mapped

`class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/Mapped.kt#L21)

Mapped iterable.

### Parameters

`fnc` - Func

`src` -

Source iterable




There is no thread-safety guarantee.




`X` - Type of source item

`Y` - Type of target item

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`<br>`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)``Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, vararg args: X)`<br>Ctor. |
