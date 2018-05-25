[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorOfInts](./index.md)

# IteratorOfInts

`class IteratorOfInts : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`

[Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns the `int`s as [Integer](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)s.

There is no thread-safety guarantee.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IteratorOfInts(vararg items: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)``IteratorOfInts(items: `[`IntArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)`, position: `[`AtomicInteger`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicInteger.html)` = AtomicInteger(0))`<br>[Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns the `int`s as [Integer](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)s. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
