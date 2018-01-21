[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.test](../index.md) / [MatcherOf](.)

# MatcherOf

`class MatcherOf<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : TypeSafeMatcher<T>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/test/MatcherOf.kt#L22)

Func as Matcher.

There is no thread-safety guarantee.

### Parameters

`func` - The func.

`T` - Type of object to match.

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MatcherOf(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<T>)`<br>`MatcherOf(func: (T) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)``MatcherOf(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<T, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>Func as Matcher. |

### Functions

| Name | Summary |
|---|---|
| [describeTo](describe-to.md) | `fun describeTo(description: Description): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [matchesSafely](matches-safely.md) | `fun matchesSafely(item: T): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
