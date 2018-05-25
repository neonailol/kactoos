[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [IoCheckedScalar](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`IoCheckedScalar(origin: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>)``IoCheckedScalar(origin: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>)`

KScalar that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`origin` - Encapsulated scalar

**Since**
0.4

