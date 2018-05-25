[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [ReplacedText](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ReplacedText(origin: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, regex: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Pattern`](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)`>, replacement: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Matcher`](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Matcher.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>)`

### Parameters

`origin` - The text

`regex` - The regular expression

`replacement` - Transforms the resulting matcher object into a replacement string.`ReplacedText(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, find: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, replace: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`

Will replace all instances of the substring matched by `find`
with `replace`.

### Parameters

`text` - The text

`find` - The regular expression

`replace` - The replacement string