---
title: UncheckedText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [UncheckedText](./index.html)

# UncheckedText

`class UncheckedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/UncheckedText.kt#L20)

Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`text` - Encapsulated text

`fallback` - Fallback func if [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) happens

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)``UncheckedText(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Ctor.`UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

