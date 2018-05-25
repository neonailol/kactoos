[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [TimedFunc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TimedFunc(function: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, milliseconds: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)``TimedFunc(time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Future`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Future.html)`<`[`Y`](index.md#Y)`>>)`

Function that gets interrupted after a certain time has passed.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - Async function

`time` - Milliseconds

**Since**
0.5

