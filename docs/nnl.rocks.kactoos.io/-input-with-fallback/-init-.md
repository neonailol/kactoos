---
title: InputWithFallback.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [InputWithFallback](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, alt: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`
`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, alt: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>)`

### Parameters

`input` - Main input

`alt` - Alternative`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)``InputWithFallback(main: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, alternative: `[`IoCheckedFunc`](../../nnl.rocks.kactoos.func/-io-checked-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>)`

Input that returns an alternative input if the main one throws
[IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html).

There is no thread-safety guarantee.

**Since**
0.9

