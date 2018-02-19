---
title: SyncIterable.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterable](../index.html) / [SyncIterable](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`SyncIterable(vararg src: `[`X`](index.html#X)`)`

### Parameters

`src` - The underlying iterable`SyncIterable(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

Synchronized iterable.

This class should be used very carefully. You must understand that
it will fetch the entire content of the encapsulated [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) on each
method call. It doesn't cache the data anyhow. If you don't
need this [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) to re-fresh
its content on every call, by doing round-trips to
the encapsulated iterable, use [StickyIterable](../-sticky-iterable/index.html).

Objects of this class are thread-safe.

### Parameters

`X` - Type of item

**Since**
0.24

