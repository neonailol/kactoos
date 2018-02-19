---
title: UncheckedText.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [UncheckedText](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)``UncheckedText(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Ctor.

### Parameters

`txt` - Encapsulated text

**Since**
0.9

`UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`

Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`text` - Encapsulated text

`fallback` - Fallback func if [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) happens

**Since**
0.3

