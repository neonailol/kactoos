[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [ProcOf](.)

# ProcOf

`class ProcOf<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/ProcOf.kt#L17)

Func as Proc.

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`proc` - The proc

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ProcOf(runnable: Runnable)`<br>`ProcOf(callable: Callable<X>)`<br>`ProcOf(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, *>)`<br>`ProcOf(proc: KProc<X>)``ProcOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>Func as Proc. |
