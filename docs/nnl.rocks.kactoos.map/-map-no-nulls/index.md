[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.map](../index.md) / [MapNoNulls](./index.md)

# MapNoNulls

`class MapNoNulls<K : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, V : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MapEnvelope`](../-map-envelope/index.md)`<`[`K`](index.md#K)`, `[`V`](index.md#V)`>`

A decorator of [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that tolerates no NULLs.

There is no thread-safety guarantee.

### Parameters

`K` - Type of key

`V` - Type of value

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MapNoNulls(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](index.md#K)`, `[`V`](index.md#V)`>)`<br>A decorator of [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that tolerates no NULLs. |
