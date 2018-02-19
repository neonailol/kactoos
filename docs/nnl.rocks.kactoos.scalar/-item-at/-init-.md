---
title: ItemAt.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [ItemAt](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`ItemAt(fallback: `[`T`](index.html#T)`, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`
`ItemAt(source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, `[`T`](index.html#T)`> = FuncOf { itr -> throw IOException("The iterable is empty") })`

Ctor.

### Parameters

`fallback` - Fallback value

`source` - Iterable`ItemAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>)`

Ctor.

### Parameters

`position` - Position

`source` - Iterable`ItemAt(position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, source: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>)`

Ctor.

### Parameters

`position` - Position

`source` - Iterable

**Since**
0.21

`ItemAt(source: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, `[`T`](index.html#T)`>)`

Ctor.

### Parameters

`source` - Iterable

`position` - Position

`fallback` - Fallback value`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>, fallback: `[`T`](index.html#T)`)`
`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, `[`T`](index.html#T)`> = FuncOf { itr -> throw IOException("Iterator is empty") })`

Ctor.

### Parameters

`iterator` - Iterator

`fallback` - Fallback value`ItemAt(iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>, position: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, `[`T`](index.html#T)`> = FuncOf { itr ->
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

`fallback` - Fallback value`ItemAt(src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](index.html#T)`>>, pos: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`T`](index.html#T)`>, `[`T`](index.html#T)`>)`

Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)
or fallback value if iterator hasn't this position.

There is no thread-safety guarantee.

### Parameters

`T` - Scalar type

**Since**
0.3

