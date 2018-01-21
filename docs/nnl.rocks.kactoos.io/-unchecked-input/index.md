[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [UncheckedInput](.)

# UncheckedInput

`class UncheckedInput : `[`Input`](../../nnl.rocks.kactoos/-input/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/UncheckedInput.kt#L18)

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
| [stream](stream.md) | `fun stream(): InputStream`<br>Get read access to it. |
