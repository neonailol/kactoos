[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedFunc](.)

# IoCheckedFunc

`class IoCheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/IoCheckedFunc.kt#L20)

Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead.

There is no thread-safety guarantee.

### Parameters

`func` - Encapsulated func

`X` - Type of input

`Y` - Type of output

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IoCheckedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Y`<br>Apply it. |
