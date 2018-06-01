[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [UncheckedBiProc](./index.md)

# UncheckedBiProc

`class UncheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedBiProc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
