[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [BiProcOf](.)

# BiProcOf

`class BiProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, in Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/BiProcOf.kt#L16)

Func as BiProc.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of input

`proc` - The proc

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `BiProcOf(proc: KBiProc<X, Y>)`<br>Func as BiProc. |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(first: X, second: Y): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
