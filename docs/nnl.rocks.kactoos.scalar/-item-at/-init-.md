[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [ItemAt](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`ItemAt(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>>, pos: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`>)``ItemAt(fallback: `[`T`](index.md#T)`, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`
`ItemAt(source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`> = FuncOf { throw IOException("The iterable is empty") })`

Ctor.

### Parameters

`fallback` - Fallback value

`source` - Iterable`ItemAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`

Ctor.

### Parameters

`position` - Position

`source` - Iterable`ItemAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, source: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`

Ctor.

### Parameters

`position` - Position

`source` - Iterable

**Since**
0.21

`ItemAt(source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`>)`

Ctor.

### Parameters

`source` - Iterable

`position` - Position

`fallback` - Fallback value`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, fallback: `[`T`](index.md#T)`)`
`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`> = FuncOf { throw IOException("Iterator is empty") })`

Ctor.

### Parameters

`iterator` - Iterator

`fallback` - Fallback value`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`> = FuncOf {
            throw IOException(
                FormattedText(
                    "Iterator doesn't have an element at #%d position",
                    position
                ).asString()
            )
        })`

Ctor.

### Parameters

`iterator` - Iterator

`position` - Position

`fallback` - Fallback value`ItemAt(src: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>>, pos: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`>)`

Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)
or fallback value if iterator hasn't this position.

There is no thread-safety guarantee.

### Parameters

`T` - KScalar type

**Since**
0.3

