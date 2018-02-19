---
title: IoCheckedProc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [IoCheckedProc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`IoCheckedProc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`

Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [java.io.IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

**Since**
0.4

