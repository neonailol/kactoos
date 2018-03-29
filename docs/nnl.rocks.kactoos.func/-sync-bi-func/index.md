[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SyncBiFunc](./index.md)

# SyncBiFunc

`class SyncBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>`

BiFunc that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of first input

`Y` - Type of second input

`Z` - Type of output

**Since**
0.18

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>)``SyncBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>BiFunc that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Z`](index.md#Z)<br>Apply it. |
