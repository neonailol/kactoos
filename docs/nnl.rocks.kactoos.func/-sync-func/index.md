[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SyncFunc](.)

# SyncFunc

`class SyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/SyncFunc.kt#L16)

Func that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`<br>`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`SyncFunc(runnable: Runnable)`<br>`SyncFunc(runnable: Runnable, result: Y)`<br>`SyncFunc(callable: Callable<Y>)`<br>`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y)``SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`<br>Func that is thread-safe. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Y`<br>Apply it. |
