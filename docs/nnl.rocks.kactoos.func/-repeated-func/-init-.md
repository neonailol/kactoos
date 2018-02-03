[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RepeatedFunc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`proc` - Proc

`max` - How many times

**Since**
0.12

`RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``RepeatedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, times: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Func that repeats its calculation a few times before returning the last result.
If [times](-init-.md#nnl.rocks.kactoos.func.RepeatedFunc$<init>(nnl.rocks.kactoos.Func((nnl.rocks.kactoos.func.RepeatedFunc.X, nnl.rocks.kactoos.func.RepeatedFunc.Y)), kotlin.Int)/times) is equal or less than zero [RepeatedFunc.apply](apply.md) will return an exception.

### Parameters

`func` - Func original

`times` - How many times.

`X` - Type of input

`Y` - Type of output

**Since**
0.6

