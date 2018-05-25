[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Equality](./index.md)

# Equality

`class Equality<T : `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.md)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`

Equality.

Returns:

* the value `0` if `x == y`;
* the value `-1` if `x < y`;
* the value `1` if `x > y`

There is no thread-safety guarantee.

### Parameters

`T` - Type of input

`left` - Left

`right` - Right

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Equality(left: `[`T`](index.md#T)`, right: `[`T`](index.md#T)`)`<br>Equality. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
