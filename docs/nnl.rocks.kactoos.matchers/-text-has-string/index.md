---
title: TextHasString - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.matchers](../index.html) / [TextHasString](./index.html)

# TextHasString

`class TextHasString : TypeSafeMatcher<`[`Text`](../../nnl.rocks.kactoos/-text/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/TextHasString.kt#L16)

Matcher for the content.

### Parameters

`matcher` - The matcher.

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `TextHasString(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Ctor.`TextHasString(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Matcher for the content. |

### Functions

| [describeMismatchSafely](describe-mismatch-safely.html) | `fun describeMismatchSafely(item: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [describeTo](describe-to.html) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.html) | `fun matchesSafely(item: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

