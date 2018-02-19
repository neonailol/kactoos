---
title: InputHasContent - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.matchers](../index.html) / [InputHasContent](./index.html)

# InputHasContent

`class InputHasContent : TypeSafeMatcher<`[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/InputHasContent.kt#L20)

Matcher for the input.

### Parameters

`matcher` - Matcher of the value.

**Since**
0.11

### Constructors

| [&lt;init&gt;](-init-.html) | `InputHasContent(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``InputHasContent(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Matcher for the input. |

### Functions

| [describeTo](describe-to.html) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(item: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

