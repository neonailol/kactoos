---
title: RepeatedFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [RepeatedFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, result: `[`Y`](index.html#Y)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`proc` - Proc

`max` - How many times

**Since**
0.12

`RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``RepeatedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, times: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

Func that repeats its calculation a few times before returning the last result.
If [times](-init-.html#nnl.rocks.kactoos.func.RepeatedFunc$<init>(nnl.rocks.kactoos.Func((nnl.rocks.kactoos.func.RepeatedFunc.X, nnl.rocks.kactoos.func.RepeatedFunc.Y)), kotlin.Int)/times) is equal or less than zero [RepeatedFunc.apply](apply.html) will return an exception.

### Parameters

`func` - Func original

`times` - How many times.

`X` - Type of input

`Y` - Type of output

**Since**
0.6

