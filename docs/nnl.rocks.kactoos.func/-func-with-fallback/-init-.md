---
title: FuncWithFallback.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [FuncWithFallback](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.html#Y)`>)``FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.html#Y)`>, follow: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Y`](index.html#Y)`>)`

Func with a fallback plan.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - The func

`fallback` - The fallback

`follow` - The follow up func

**Since**
0.2

