[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [StickyFunc](./index.md)

# StickyFunc

`class StickyFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/StickyFunc.kt#L25)

Func that caches previously calculated values and doesn't
recalculate again.

This [Func](../../nnl.rocks.kactoos/-func/index.md) decorator technically is an in-memory
cache.

Pay attention that this class is not thread-safe. It is highly
recommended to always decorate it with [SyncFunc](../-sync-func/index.md).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

**See Also**

[StickyScalar](../../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md)

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `StickyFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`StickyFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)``StickyFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<`[`X`](index.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, `[`Y`](index.md#Y)`>)`<br>Func that caches previously calculated values and doesn't recalculate again. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`X`](index.md#X)`): `[`Y`](index.md#Y)<br>Apply it. |
