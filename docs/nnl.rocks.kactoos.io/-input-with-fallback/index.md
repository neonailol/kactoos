---
title: InputWithFallback - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [InputWithFallback](./index.html)

# InputWithFallback

`class InputWithFallback : `[`Input`](../../nnl.rocks.kactoos/-input/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/InputWithFallback.kt#L22)

Input that returns an alternative input if the main one throws
[IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html).

There is no thread-safety guarantee.

**Since**
0.9

### Constructors

| [&lt;init&gt;](-init-.html) | `InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, alt: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`<br>`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`<br>`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, alt: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>)``InputWithFallback(main: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`, alternative: `[`IoCheckedFunc`](../../nnl.rocks.kactoos.func/-io-checked-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>)`<br>Input that returns an alternative input if the main one throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html). |

### Functions

| [stream](stream.html) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

