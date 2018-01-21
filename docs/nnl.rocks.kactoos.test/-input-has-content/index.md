[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.test](../index.md) / [InputHasContent](.)

# InputHasContent

`class InputHasContent : TypeSafeMatcher<`[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/test/InputHasContent.kt#L20)

Matcher for the input.

### Parameters

`matcher` - Matcher of the value.

**Since**
0.11

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InputHasContent(text: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)``InputHasContent(matcher: Matcher<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Matcher for the input. |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
