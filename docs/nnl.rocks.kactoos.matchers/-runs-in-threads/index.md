---
title: RunsInThreads - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.matchers](../index.html) / [RunsInThreads](./index.html)

# RunsInThreads

`class RunsInThreads<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`T`](index.html#T)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/RunsInThreads.kt#L21)

Matcher for [Func](../../nnl.rocks.kactoos/-func/index.html) that must run in multiple threads.

### Parameters

`input` - Input object

`T` - Type of input

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `RunsInThreads(input: `[`T`](index.html#T)`? = null, total: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = Runtime.getRuntime().availableProcessors() shl 4)`<br>Matcher for [Func](../../nnl.rocks.kactoos/-func/index.html) that must run in multiple threads. |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`T`](index.html#T)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

