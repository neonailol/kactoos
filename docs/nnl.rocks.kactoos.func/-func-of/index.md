[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [FuncOf](./index.md)

# FuncOf

`class FuncOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input.

`Y` - Type of output.

`func` - Func.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FuncOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`)``FuncOf(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>Represents many possible inputs as [Func](../../nnl.rocks.kactoos/-func/index.md). |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(result: `[`Y`](invoke.md#Y)`): `[`FuncOf`](./index.md)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, `[`Y`](invoke.md#Y)`>` |
