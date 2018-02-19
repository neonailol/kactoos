---
title: IoCheckedFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [IoCheckedFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`IoCheckedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

### Parameters

`func` - Encapsulated func

`X` - Type of input

`Y` - Type of output

**Since**
0.4

