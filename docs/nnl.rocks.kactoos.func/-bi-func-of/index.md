[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [BiFuncOf](./index.md)

# BiFuncOf

`class BiFuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>`

Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`func` - Func

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BiFuncOf(fnc: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`<br>`BiFuncOf(result: `[`Z`](index.md#Z)`)`<br>`BiFuncOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Z`](index.md#Z)`>)`<br>`BiFuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Z`](index.md#Z)`)`<br>`BiFuncOf(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, result: `[`Z`](index.md#Z)`)``BiFuncOf(func: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)`<br>Represents many possible inputs as [BiFunc](../../nnl.rocks.kactoos/-bi-func/index.md). |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Z`](index.md#Z)<br>Apply it. |
