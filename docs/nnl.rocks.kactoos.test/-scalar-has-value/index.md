[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.test](../index.md) / [ScalarHasValue](./index.md)

# ScalarHasValue

`class ScalarHasValue<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/test/ScalarHasValue.kt#L20)

Matcher for the value.

### Parameters

`matcher` - The matcher.

`T` - Type of result.

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ScalarHasValue(value: `[`T`](index.md#T)`)``ScalarHasValue(matcher: Matcher<`[`T`](index.md#T)`>)`<br>Matcher for the value. |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`T`](index.md#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
