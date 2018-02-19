---
title: IoCheckedBiProc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [IoCheckedBiProc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`IoCheckedBiProc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`

BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

`Y` - Type of input

**Since**
0.22

