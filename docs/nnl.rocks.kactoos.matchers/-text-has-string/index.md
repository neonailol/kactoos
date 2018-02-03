[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.matchers](../index.md) / [TextHasString](./index.md)

# TextHasString

`class TextHasString : TypeSafeMatcher<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/TextHasString.kt#L19)

Matcher for the content.

### Parameters

`matcher` - The matcher.

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TextHasString(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``TextHasString(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Matcher for the content. |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
