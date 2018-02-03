[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [DeadOutput](./index.md)

# DeadOutput

`class DeadOutput : `[`Output`](../../nnl.rocks.kactoos/-output/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/DeadOutput.kt#L17)

Output that accepts anything.

There is no thread-safety guarantee.

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DeadOutput()`<br>Output that accepts anything. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |
