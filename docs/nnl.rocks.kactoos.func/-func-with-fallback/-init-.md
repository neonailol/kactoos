[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncWithFallback](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, Y>)``FuncWithFallback(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, Y>, follow: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Y>)`

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

