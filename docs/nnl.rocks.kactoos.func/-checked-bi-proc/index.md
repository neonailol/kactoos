[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CheckedBiProc](./index.md)

# CheckedBiProc

`class CheckedBiProc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, E> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

BiProc that throws exception of specified type.

### Parameters

`X` - Type of input

`Y` - Type of input

`E` - Exception's type

`origin` - Original BiProc

`func` - Function that wraps exceptions.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedBiProc(origin: `[`KBiProc`](../../nnl.rocks.kactoos/-k-bi-proc.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>BiProc that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
