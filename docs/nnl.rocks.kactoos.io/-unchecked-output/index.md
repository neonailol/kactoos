[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [UncheckedOutput](.)

# UncheckedOutput

`class UncheckedOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/UncheckedOutput.kt#L18)

Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

**Since**
0.9

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedOutput(output: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): OutputStream`<br>Get write access to it. |
