[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [AsyncFunc](.)

# AsyncFunc

`class AsyncFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Future<Y>>, `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/AsyncFunc.kt#L29)

Func that runs in the background.

If you want your piece of code to be executed in the background, use AsyncFunc as following:

```
int length = new AsyncFunc(
  input -> input.length()
).invoke("Hello, world!").get();
```

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

`Y` - Type of output

`func` - The func

`executor` - Executor Service

**Since**
0.10

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, result: Y, fct: ThreadFactory)`<br>`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, fct: ThreadFactory)`<br>`AsyncFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>)`<br>`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, executor: ExecutorService)`<br>`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>`AsyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, threadFactory: ThreadFactory)``AsyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, executor: ExecutorService)`<br>Func that runs in the background. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Future<Y>`<br>Apply it. |
| [exec](exec.md) | `fun exec(input: X): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
