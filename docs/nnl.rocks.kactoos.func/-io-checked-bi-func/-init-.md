[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedBiFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`IoCheckedBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>)`

Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead.

There is no thread-safety guarantee.

### Parameters

`func` - Encapsulated func

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

**Since**
0.13

