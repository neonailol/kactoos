[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [UncheckedProc](.)

# UncheckedProc

`class UncheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/UncheckedProc.kt#L17)

Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `UncheckedProc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>)`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| Name | Summary |
|---|---|
| [exec](exec.md) | `fun exec(input: X): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |
