[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [FallbackFrom](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`FallbackFrom(exp: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`T`](index.md#T)`>)``FallbackFrom(exceptions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>>, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`T`](index.md#T)`>)`

Fallback from exception.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`exceptions` - The list of exceptions supported by this instance.

`func` - Function that converts exceptions to the required type.

**Since**
0.5
