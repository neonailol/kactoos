[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedBiFunc](.)

# IoCheckedBiFunc

`class IoCheckedBiFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/IoCheckedBiFunc.kt#L20)

Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead.

There is no thread-safety guarantee.

### Parameters

`func` - Encapsulated func

`X` - Type of input

`Y` - Type of input

`Z` - Type of output

**Since**
0.13

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IoCheckedBiFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.md)`<X, Y, Z>)`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(first: X, second: Y): Z`<br>Apply it. |
