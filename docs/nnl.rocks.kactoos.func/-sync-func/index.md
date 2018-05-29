[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SyncFunc](./index.md)

# SyncFunc

`class SyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Func that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncFunc(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`<br>`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`)``SyncFunc(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Func that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |
