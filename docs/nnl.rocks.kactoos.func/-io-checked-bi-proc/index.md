[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [IoCheckedBiProc](.)

# IoCheckedBiProc

`class IoCheckedBiProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/IoCheckedBiProc.kt#L18)

BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead.

There is no thread-safety guarantee.

### Parameters

`proc` - Encapsulated func

`X` - Type of input

`Y` - Type of input

**Since**
0.22

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IoCheckedBiProc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<X, Y>)`<br>BiProc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), but throws [IOException](#) instead. |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(first: X, second: Y): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
