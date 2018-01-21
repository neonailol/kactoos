[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [ChainedFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`ChainedFunc(bfr: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, atr: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Z>)`

### Parameters

`bfr` - Before function

`atr` - After function`ChainedFunc(before: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, functions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Y>>, after: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Z>)`

Composed function.

### Parameters

`before` - Before function

`functions` - Functions

`after` - After function

`X` - Type of input.

`Y` - Intermediate type.

`Z` - Type of output.

**Since**
0.7

