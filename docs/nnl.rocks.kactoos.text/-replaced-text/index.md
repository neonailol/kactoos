[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [ReplacedText](.)

# ReplacedText

`class ReplacedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/text/ReplacedText.kt#L41)

Replace the Text.

The given [regex](#) is used to produce a
[matcher](#) that will be
transformed by `func` into a replacement string to replace each
[matching](#) substring.

Example usage:

```
final String result = new ReplacedText(
new TextOf("one two THREE four FIVE six"),
() -> Pattern.compile("[a-z]+"),
matcher -> String.valueOf(matcher.group().length())
).asString();  //will return the string "3 3 THREE 4 FIVE 3"
```

Note: a [PatternSyntaxException](#) will be thrown if the
regular expression's syntax is invalid.

### Parameters

`origin` - The text

`regex` - The regular expression

`replacement` - Transforms the resulting matcher object into a replacement
string. Any exceptions will be wrapped in an [IOException](#).

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ReplacedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, find: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, replace: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Will replace all instances of the substring matched by `find` with `replace`.`ReplacedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, regex: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<Pattern>, replacement: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Matcher, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Replace the Text. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
| [compareTo](compare-to.md) | `fun compareTo(other: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
