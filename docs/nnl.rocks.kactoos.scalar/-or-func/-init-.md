---
title: OrFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [OrFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`OrFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, vararg src: `[`X`](index.html#X)`)`

### Parameters

`proc` - Proc to map

`src` - The iterable

`X` - Type of items in the iterable`OrFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`

### Parameters

`func` - Func to map

`src` - The iterable

`X` - Type of items in the iterable`OrFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`
`OrFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable

**Since**
0.24

`OrFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable

**Since**
0.24

`OrFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable`OrFunc(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`

Logical disjunction.

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

### Parameters

`origin` - The iterable.

**Since**
0.8

