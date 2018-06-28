[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.text](../index.md) / [RandomText](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`RandomText(len: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`RandomText(len: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`> = {
            SecureRandom().nextInt(
                RandomText.MAX_RANDOM_LENGTH - 1
            ) + 1
        })`

Ctor.

### Parameters

`len` - Length of generated text.`RandomText(vararg chrs: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

Ctor.

### Parameters

`chrs` - Array of characters allowed for generating.`RandomText(len: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, vararg chrs: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)`

Ctor.

### Parameters

`len` - Length of generated text.

`chrs` - Array of characters allowed for generating.`RandomText(characters: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>, length: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`> = { SecureRandom().nextInt(RandomText.MAX_RANDOM_LENGTH - 1) + 1 }, random: `[`Random`](http://docs.oracle.com/javase/8/docs/api/java/util/Random.html)` = SecureRandom())`

Random text.

There is no thread-safety guarantee.

### Parameters

`characters` - List of characters allowed for generating.

`length` - Length of generated text.

`random` - Characters index randomizer.

**Since**
0.4

