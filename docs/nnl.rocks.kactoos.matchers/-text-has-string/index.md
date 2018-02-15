[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.matchers](../index.md) / [TextHasString](./index.md)

# TextHasString

`class TextHasString : TypeSafeMatcher<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/TextHasString.kt#L16)

Matcher for the content.

### Parameters

`matcher` - The matcher.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TextHasString(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Ctor.`TextHasString(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Matcher for the content. |

### Functions

| Name | Summary |
|---|---|
| [describeMismatchSafely](describe-mismatch-safely.md) | `fun describeMismatchSafely(item: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
