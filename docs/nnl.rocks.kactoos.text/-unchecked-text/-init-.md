[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [UncheckedText](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)``UncheckedText(txt: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Ctor.

### Parameters

`txt` - Encapsulated text

**Since**
0.9

`UncheckedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<IOException, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`

Text that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`text` - Encapsulated text

`fallback` - Fallback func if [IOException](#) happens

**Since**
0.3

