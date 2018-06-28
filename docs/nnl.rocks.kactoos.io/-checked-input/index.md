[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [CheckedInput](./index.md)

# CheckedInput

`class CheckedInput<E> : `[`Input`](../../nnl.rocks.kactoos/-input/index.md)

Input that throws exception of specified type.

### Parameters

`E` - Exception's type.

`origin` - Origin input.

`func` - Function that wraps exceptions.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedInput(origin: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>Input that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
