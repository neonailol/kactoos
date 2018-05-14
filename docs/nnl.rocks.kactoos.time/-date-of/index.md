[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.time](../index.md) / [DateOf](./index.md)

# DateOf

`class DateOf : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`>`

Parser for [Date](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html) instances.
Parsing the date using the provided formatter.

### Parameters

`parsed` - The parsed date

**Since**
0.27

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, formatter: `[`DateTimeFormatter`](http://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)`)`<br>`DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``DateOf(date: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, format: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>Parses the date using the provided format.`DateOf(parsed: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)`>)`<br>Parser for [Date](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html) instances. Parsing the date using the provided formatter. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`Date`](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html) |
