[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedBiProc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`IoCheckedBiProc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<X, Y>)`

BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

`Y` - Type of input

**Since**
0.22

