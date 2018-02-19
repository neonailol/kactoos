---
title: JoinedText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [JoinedText](./index.html)

# JoinedText

`class JoinedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/JoinedText.kt#L22)

Join a Text.

### Parameters

`delimiter` - Delimit among texts

`texts` -

Texts to be joined




There is no thread-safety guarantee.




**Since**
0.9

### Constructors

| [&lt;init&gt;](-init-.html) | `JoinedText(delimit: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, vararg strs: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`JoinedText(delimit: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, strs: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>`JoinedText(delimit: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, vararg txts: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`<br>Ctor.`JoinedText(delimiter: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, texts: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.html)`>)`<br>Join a Text. |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |

