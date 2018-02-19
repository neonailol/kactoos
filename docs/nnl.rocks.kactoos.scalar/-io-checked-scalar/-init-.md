---
title: IoCheckedScalar.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [IoCheckedScalar](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`IoCheckedScalar(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>)`

Scalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws
[IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](index.html) decorators.

### Parameters

`T` - Type of result

`origin` - Encapsulated scalar

**Since**
0.4

