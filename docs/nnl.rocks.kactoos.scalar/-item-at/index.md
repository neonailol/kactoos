[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [ItemAt](./index.md)

# ItemAt

`class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`T`](index.md#T)`>`

Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)
or fallback value if iterator hasn't this position.

There is no thread-safety guarantee.

### Parameters

`T` - KScalar type

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ItemAt(fallback: `[`T`](index.md#T)`, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`ItemAt(source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`> = FuncOf { throw IOException("The iterable is empty") })`<br>`ItemAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>)`<br>`ItemAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, source: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>)`<br>`ItemAt(source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`>)`<br>`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, fallback: `[`T`](index.md#T)`)`<br>`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`> = FuncOf { throw IOException("Iterator is empty") })`<br>`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`> = FuncOf {
            throw IOException(
                FormattedText(
                    "Iterator doesn't have an element at #%d position",
                    position
                ).asString()
            )
        })`<br>Ctor.`ItemAt(src: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.md#T)`>>, pos: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.md#T)`>, `[`T`](index.md#T)`>)`<br>Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) or fallback value if iterator hasn't this position. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`T`](index.md#T) |
