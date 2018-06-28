[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [CheckedOutput](./index.md)

# CheckedOutput

`class CheckedOutput<E> : `[`Output`](../../nnl.rocks.kactoos/-output/index.md)

Output that throws exception of specified type.

### Parameters

`E` - Exception's type.

`origin` - Origin output.

`func` - Function that wraps exceptions.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedOutput(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>Output that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`OutputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html)<br>Get write access to it. |
