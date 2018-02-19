[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedProc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`IoCheckedProc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>)`

Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [java.io.IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

**Since**
0.4

