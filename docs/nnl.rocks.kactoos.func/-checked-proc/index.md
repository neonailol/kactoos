[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CheckedProc](./index.md)

# CheckedProc

`class CheckedProc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, E> : `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>`

Proc that throws exception of specified type.

### Parameters

`X` - Type of input

`E` - Exception's type

`origin` - Original proc

`func` - Function that wraps exceptions.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedProc(origin: `[`KProc`](../../nnl.rocks.kactoos/-k-proc.md)`<`[`X`](index.md#X)`>, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>Proc that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(input: `[`X`](index.md#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
