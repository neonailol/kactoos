---
title: UncheckedProc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [UncheckedProc](./index.html)

# UncheckedProc

`class UncheckedProc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/UncheckedProc.kt#L17)

Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html).

There is no thread-safety guarantee.

### Parameters

`X` - Type of input

**Since**
0.2

### Constructors

| [&lt;init&gt;](-init-.html) | `UncheckedProc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>)`<br>Proc that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |

### Functions

| [exec](exec.html) | `fun exec(input: `[`X`](index.html#X)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Execute it. |

