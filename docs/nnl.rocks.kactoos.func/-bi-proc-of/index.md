[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [BiProcOf](./index.md)

# BiProcOf

`class BiProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Func as BiProc.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`proc` - The proc

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BiProcOf(proc: `[`KBiProc`](../../nnl.rocks.kactoos/-k-bi-proc.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>Func as BiProc. |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
