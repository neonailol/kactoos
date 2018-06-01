[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [ChainedFunc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ChainedFunc(before: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, after: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`

### Parameters

`before` - Before function

`after` - After function`ChainedFunc(before: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, functions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Y`](index.md#Y)`, `[`Y`](index.md#Y)`>>, after: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`

Composed function.

### Parameters

`before` - Before function

`functions` - Functions

`after` - After function

`X` - Type of input.

`Y` - Intermediate type.

`Z` - Type of output.

**Since**
0.4

