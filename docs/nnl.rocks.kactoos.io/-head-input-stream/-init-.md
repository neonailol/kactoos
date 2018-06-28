[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [HeadInputStream](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`HeadInputStream(origin: `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)`, length: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`

Input stream that only shows the first N bytes of the original stream.

There is no thread-safety guarantee.

### Parameters

`origin` - The original input stream.

`len` - A number of bytes that can be read from the beginning.

**Since**
0.4

