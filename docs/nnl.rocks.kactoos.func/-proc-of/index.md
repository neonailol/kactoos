[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [ProcOf](./index.md)

# ProcOf

`class ProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>`

Func as Proc.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`proc` - The proc

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ProcOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, *>)``ProcOf(proc: `[`KProc`](../../nnl.rocks.kactoos/-k-proc.md)`<`[`X`](index.md#X)`>)`<br>Func as Proc. |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(input: `[`X`](index.md#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
