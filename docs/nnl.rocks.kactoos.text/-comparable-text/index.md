[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [ComparableText](./index.md)

# ComparableText

`class ComparableText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/ComparableText.kt#L26)

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

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ComparableText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>Text implementing Comparable. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
