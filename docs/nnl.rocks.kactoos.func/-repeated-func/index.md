[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RepeatedFunc](./index.md)

# RepeatedFunc

`class RepeatedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Func that repeats its calculation a few times before returning the last result.
If [times](#) is equal or less than zero [RepeatedFunc.apply](apply.md) will return an exception.

### Parameters

`func` - Func original

`times` - How many times.

`X` - Type of input

`Y` - Type of output

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RepeatedFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``RepeatedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, times: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>Func that repeats its calculation a few times before returning the last result. If [times](#) is equal or less than zero [RepeatedFunc.apply](apply.md) will return an exception. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |
