[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedProc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`IoCheckedProc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`

Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [java.io.IOException](#) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

**Since**
0.4

