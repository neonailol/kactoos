[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [RandomText](./index.md)

# RandomText

`class RandomText : `[`Text`](../../nnl.rocks.kactoos/-text/index.md)

Random text.

There is no thread-safety guarantee.

### Parameters

`characters` - List of characters allowed for generating.

`length` - Length of generated text.

`random` - Characters index randomizer.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `RandomText(len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`RandomText(len: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`> = {
            SecureRandom().nextInt(
                RandomText.MAX_RANDOM_LENGTH - 1
            ) + 1
        })`<br>`RandomText(vararg chrs: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>`RandomText(len: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, vararg chrs: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`<br>Ctor.`RandomText(characters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>, length: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`> = { SecureRandom().nextInt(RandomText.MAX_RANDOM_LENGTH - 1) + 1 }, random: `[`Random`](http://docs.oracle.com/javase/8/docs/api/java/util/Random.html)` = SecureRandom())`<br>Random text. |

### Functions

| Name | Summary |
|---|---|
| [asString](as-string.md) | `fun asString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Convert it to the string. |
