[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CheckedFunc](./index.md)

# CheckedFunc

`class CheckedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, E> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>`

Func that throws exception of specified type.

### Parameters

`X` - Type of input

`Y` - Type of output

`E` - Exception's type

`origin` - Original func

`func` - Function that wraps exceptions.

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedFunc(origin: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>Func that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |
