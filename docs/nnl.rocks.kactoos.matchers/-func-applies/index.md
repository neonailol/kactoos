---
title: FuncApplies - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.matchers](../index.html) / [FuncApplies](./index.html)

# FuncApplies

`class FuncApplies<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/FuncApplies.kt#L23)

Matcher for the value.

### Parameters

`input` - Input of the function.

`matcher` - Matcher of the result.

`X` - Type of input

`Y` - Type of output

**Since**
0.2

### Constructors

| [&lt;init&gt;](-init-.html) | `FuncApplies(input: `[`X`](index.html#X)`, result: `[`Y`](index.html#Y)`)``FuncApplies(input: `[`X`](index.html#X)`, matcher: Matcher<`[`Y`](index.html#Y)`>)`<br>Matcher for the value. |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

