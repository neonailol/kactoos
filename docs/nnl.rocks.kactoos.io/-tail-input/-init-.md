[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TailInput](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TailInput(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, count: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 16384)`

Input showing only last N bytes of the stream.

There is no thread-safety guarantee.

### Parameters

`input` - Input to decorate

`count` - Number of last bytes to show from input

`max` - Maximum number of bytes to read at once

**Since**
0.5

