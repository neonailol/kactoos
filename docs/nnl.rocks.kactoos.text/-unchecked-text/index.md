[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [UncheckedText](./index.md)

# UncheckedText

`class UncheckedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`text` - Encapsulated text

`fallback` - Fallback func if [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) happens

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)``UncheckedText(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Ctor.`UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`IOException`](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
