[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncWithFallback](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.md#Y)`>)``FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Y`](index.md#Y)`>, follow: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Y`](index.md#Y)`, `[`Y`](index.md#Y)`>)`

Func with a fallback plan.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - The func

`fallback` - The fallback

`follow` - The follow up func

**Since**
0.2

