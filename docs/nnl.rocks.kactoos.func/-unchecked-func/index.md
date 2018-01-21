[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [UncheckedFunc](.)

# UncheckedFunc

`class UncheckedFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/UncheckedFunc.kt#L18)

Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`<br>Func that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Y`<br>Apply it. |
