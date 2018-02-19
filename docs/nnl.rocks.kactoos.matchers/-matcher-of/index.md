---
title: MatcherOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.matchers](../index.html) / [MatcherOf](./index.html)

# MatcherOf

`class MatcherOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`T`](index.html#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/MatcherOf.kt#L19)

Func as Matcher.

There is no thread-safety guarantee.

### Parameters

`func` - The func.

`T` - Type of object to match.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `MatcherOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`T`](index.html#T)`>)``MatcherOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`T`](index.html#T)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>Func as Matcher. |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(item: `[`T`](index.html#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

