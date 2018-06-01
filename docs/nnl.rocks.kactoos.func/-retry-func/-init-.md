[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [RetryFunc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`)`

### Parameters

`proc` - Func original

**Since**
0.4

`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`proc` - Func original

`attempts` - Maximum number of attempts

**Since**
0.4

`RetryFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`, ext: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`

### Parameters

`proc` - Func original

`ext` - Exit condition, returns TRUE if there is no more reason to try

**Since**
0.4

`RetryFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, attempts: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`fnc` - Func original

`attempts` - Maximum number of attempts`RetryFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)``RetryFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, exit: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`

Func that will try a few times before throwing an exception.

There is no thread-safety guarantee.

### Parameters

`func` - Func original

`exit` - Exit condition, returns TRUE if there is no more reason to try

`X` - Type of input

`Y` - Type of output

**Since**
0.4

