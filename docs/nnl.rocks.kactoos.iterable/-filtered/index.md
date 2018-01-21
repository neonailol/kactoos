[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [Filtered](.)

# Filtered

`class Filtered<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`IterableEnvelope`](../-iterable-envelope/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/Filtered.kt#L33)

Filtered iterable.

You can use it in order to create a declarative/lazy
version of a filtered collection/iterable. For example,
this code will create a list of two strings "hello" and "world":

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**See Also**

[Filtered](../../nnl.rocks.kactoos.iterator/-filtered/index.md)

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: X)`<br>`Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)``Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`<br>Filtered iterable. |
