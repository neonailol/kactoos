[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RetryFunc](.)

# RetryFunc

`class RetryFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/RetryFunc.kt#L20)

Func that will try a few times before throwing an exception.

There is no thread-safety guarantee.

### Parameters

`func` - Func original

`exit` - Exit condition, returns TRUE if there is no more reason to try

`X` - Type of input

`Y` - Type of output

**Since**
0.8

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y)`<br>`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y, ext: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>`RetryFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RetryFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`<br>`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)``RetryFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, exit: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>Func that will try a few times before throwing an exception. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Y`<br>Apply it. |
