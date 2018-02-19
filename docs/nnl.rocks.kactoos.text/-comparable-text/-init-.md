---
title: ComparableText.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.text](../index.html) / [ComparableText](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`ComparableText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`

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

