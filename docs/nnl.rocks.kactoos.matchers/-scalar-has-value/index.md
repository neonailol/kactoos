---
title: ScalarHasValue - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.matchers](../index.html) / [ScalarHasValue](./index.html)

# ScalarHasValue

`class ScalarHasValue<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/ScalarHasValue.kt#L20)

Matcher for the value.

### Parameters

`matcher` - The matcher.

`T` - Type of result.

**Since**
0.2

### Constructors

| [&lt;init&gt;](-init-.html) | `ScalarHasValue(value: `[`T`](index.html#T)`)``ScalarHasValue(matcher: Matcher<`[`T`](index.html#T)`>)`<br>Matcher for the value. |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(item: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`T`](index.html#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

