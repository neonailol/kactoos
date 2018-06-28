[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [CheckedBiFunc](./index.md)

# CheckedBiFunc

`class CheckedBiFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, E> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>`

BiFunc that throws exception of specified type.

### Parameters

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

`E` - Exception's type

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `CheckedBiFunc(origin: `[`KBiFunc`](../../nnl.rocks.kactoos/-k-bi-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`, `[`Z`](index.md#Z)`>, func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`Exception`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)`, `[`E`](index.md#E)`>)`<br>BiFunc that throws exception of specified type. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(first: `[`X`](index.md#X)`, second: `[`Y`](index.md#Y)`): `[`Z`](index.md#Z)<br>Apply it. |
