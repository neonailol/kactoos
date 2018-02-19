---
title: ComparableText - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [ComparableText](./index.html)

# ComparableText

`class ComparableText : `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/ComparableText.kt#L26)

Text implementing Comparable.

Below the example how you can sort words in a string:

```
Iterable<Text> sorted = new Sorted<>(
  new Mapped<>(
    ComparableText::new,
    new SplitText("The quick brown fox jumps over the lazy dog", " ")
  )
)
```

There is no thread-safety guarantee.

**Since**
0.27

### Constructors

| [&lt;init&gt;](-init-.html) | `ComparableText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`<br>Text implementing Comparable. |

### Functions

| [asString](as-string.html) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.html) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

