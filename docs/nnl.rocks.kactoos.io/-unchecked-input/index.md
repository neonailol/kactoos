[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [UncheckedInput](./index.md)

# UncheckedInput

`class UncheckedInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md)

Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
