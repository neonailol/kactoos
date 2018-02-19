---
title: Filtered.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterable](../index.html) / [Filtered](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`
`Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`fnc` - Predicate

`src` - Source iterable

**Since**
0.21

`Filtered(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

Filtered iterable.

You can use it in order to create a declarative/lazy
version of a filtered collection/iterable. For example,
this code will create a list of two strings "hello" and "world":

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**See Also**

[Filtered](../../nnl.rocks.kactoos.iterator/-filtered/index.html)

**Since**
0.1

