[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [ComparableText](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`ComparableText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`

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

