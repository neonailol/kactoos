---
title: Limited.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [Limited](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Limited(restrict: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, origin: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`

Limited origin.

This is a decorator over an existing origin. Returns elements of the
original origin, until either the requested number of items have been
returned or the underlying origin has been exhausted.

There is no thread-safety guarantee.

### Parameters

`T` - Element type

**Since**
0.6

