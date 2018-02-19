---
title: NumberOf.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [NumberOf](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`NumberOf(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`
`NumberOf(txt: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`

### Parameters

`txt` - Number-string`NumberOf(dnum: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>)`

Text as [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html).

There is no thread-safety guarantee.

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

**Since**
0.2

