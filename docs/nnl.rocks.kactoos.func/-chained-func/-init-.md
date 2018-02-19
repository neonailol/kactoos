---
title: ChainedFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [ChainedFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`ChainedFunc(bfr: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, atr: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`

### Parameters

`bfr` - Before function

`atr` - After function`ChainedFunc(before: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, functions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Y`](index.html#Y)`>>, after: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Y`](index.html#Y)`, `[`Z`](index.html#Z)`>)`

Composed function.

### Parameters

`before` - Before function

`functions` - Functions

`after` - After function

`X` - Type of input.

`Y` - Intermediate type.

`Z` - Type of output.

**Since**
0.7

