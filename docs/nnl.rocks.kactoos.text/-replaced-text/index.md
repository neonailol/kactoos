[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [ReplacedText](./index.md)

# ReplacedText

`class ReplacedText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Replace the Text.

The given [regex](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html) is used to produce a
[matcher](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#matcher(java.lang.CharSequence)) that will be
transformed by `func` into a replacement string to replace each
[matching](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html#find()) substring.

Example usage:

```
final String result = new ReplacedText(
new TextOf("one two THREE four FIVE six"),
() -> Pattern.compile("[a-z]+"),
matcher -> String.valueOf(matcher.group().length())
).asString();  //will return the string "3 3 THREE 4 FIVE 3"
```

Note: a [PatternSyntaxException](http://docs.oracle.com/javase/8/docs/api/java/util/regex/PatternSyntaxException.html) will be thrown if the
regular expression's syntax is invalid.

### Parameters

`origin` - The text

`regex` - The regular expression

`replacement` - Transforms the resulting matcher object into a replacement
string. Any exceptions will be wrapped in an [IOException](http://docs.oracle.com/javase/8/docs/api/java/io/IOException.html).

**Since**
0.2

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ReplacedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, find: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, replace: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Will replace all instances of the substring matched by `find` with `replace`.`ReplacedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, regex: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Pattern`](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)`>, replacement: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Matcher`](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`<br>Replace the Text. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
