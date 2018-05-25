[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorOfLongs](./index.md)

# IteratorOfLongs

`class IteratorOfLongs : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>`

[Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns the `long`s as [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)s.

There is no thread-safety guarantee.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IteratorOfLongs(vararg items: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)``IteratorOfLongs(items: `[`LongArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html)`, position: `[`AtomicInteger`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicInteger.html)` = AtomicInteger(0))`<br>[Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns the `long`s as [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)s. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
