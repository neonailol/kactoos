[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SyncBiFunc](.)

# SyncBiFunc

`class SyncBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/SyncBiFunc.kt#L15)

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
| [&lt;init&gt;](-init-.md) | `SyncBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>)``SyncBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>BiFunc that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(first: X, second: Y): Z`<br>Apply it. |
