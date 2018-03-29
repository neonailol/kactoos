[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [SyncText](./index.md)

# SyncText

`class SyncText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Text that is thread-safe.

### Parameters

`origin` - The text

`lock` -

The lock




There is no thread-safety guarantee.

**Since**
0.18

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)``SyncText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Text that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
