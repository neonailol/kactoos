[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.matchers](../index.md) / [MatcherOf](./index.md)

# MatcherOf

`class MatcherOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<`[`T`](index.md#T)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/matchers/MatcherOf.kt#L19)

Func as Matcher.

There is no thread-safety guarantee.

### Parameters

`func` - The func.

`T` - Type of object to match.

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MatcherOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`T`](index.md#T)`>)``MatcherOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`T`](index.md#T)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>Func as Matcher. |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: `[`T`](index.md#T)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
