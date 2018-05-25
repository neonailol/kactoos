[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [IteratorOfChars](./index.md)

# IteratorOfChars

`class IteratorOfChars : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`

[Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns the `char`s as [Character](http://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)s.

There is no thread-safety guarantee.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `IteratorOfChars(vararg items: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`)``IteratorOfChars(items: `[`CharArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html)`, position: `[`AtomicInteger`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicInteger.html)` = AtomicInteger(0))`<br>[Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns the `char`s as [Character](http://docs.oracle.com/javase/8/docs/api/java/lang/Character.html)s. |

### Functions

| Name | Summary |
|---|---|
| [hasNext](has-next.md) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.md) | `fun next(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
