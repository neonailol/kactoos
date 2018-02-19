---
title: TrimmedText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [TrimmedText](./index.html)

# TrimmedText

`class TrimmedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/TrimmedText.kt#L18)

Text without control characters (char &amp;lt;= 32) from both ends.

### Parameters

`origin` -

The text




There is no thread-safety guarantee.




**Since**
0.1

### Constructors

| [&lt;init&gt;](-init-.html) | `TrimmedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`<br>Text without control characters (char &amp;lt;= 32) from both ends. |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

