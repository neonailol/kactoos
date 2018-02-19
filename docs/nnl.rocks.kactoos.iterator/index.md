---
title: nnl.rocks.kactoos.iterator - kactoos-jvm
---

[kactoos-jvm](../index.html) / [nnl.rocks.kactoos.iterator](./index.html)

## Package nnl.rocks.kactoos.iterator

Iterators.

### Types

| [Cycled](-cycled/index.html) | `class Cycled<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-cycled/index.html#T)`>`<br>Cycled Iterator. |
| [Endless](-endless/index.html) | `class Endless<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-endless/index.html#T)`>`<br>Iterator that never ends. |
| [Filtered](-filtered/index.html) | `class Filtered<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](-filtered/index.html#X)`>`<br>Filtered iterator. |
| [IteratorNoNulls](-iterator-no-nulls/index.html) | `class IteratorNoNulls<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`MutableIterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-iterator/index.html)`<`[`X`](-iterator-no-nulls/index.html#X)`>`<br>A decorator of an [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) that returns no NULL. |
| [Joined](-joined/index.html) | `class Joined<T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-joined/index.html#T)`>`<br>A few Iterators joined together. |
| [LengthOf](-length-of/index.html) | `class LengthOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.html)<br>Length of iterator. |
| [Limited](-limited/index.html) | `class Limited<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-limited/index.html#T)`>`<br>Limited origin. |
| [Mapped](-mapped/index.html) | `class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`Y`](-mapped/index.html#Y)`>`<br>Mapped iterator. |
| [Partitioned](-partitioned/index.html) | `class Partitioned<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](-partitioned/index.html#T)`>>`<br>Iterator implementation for [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) partitioning. |
| [Repeated](-repeated/index.html) | `class Repeated<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-repeated/index.html#T)`>`<br>Repeat an element. |
| [Shuffled](-shuffled/index.html) | `class Shuffled<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-shuffled/index.html#T)`>`<br>Shuffled iterator. |
| [Skipped](-skipped/index.html) | `class Skipped<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-skipped/index.html#T)`>`<br>Skipped iterator. |
| [Sorted](-sorted/index.html) | `class Sorted<T : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`T`](-sorted/index.html#T)`>> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-sorted/index.html#T)`>`<br>Sorted iterator. |
| [StickyIterator](-sticky-iterator/index.html) | `class StickyIterator<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](-sticky-iterator/index.html#X)`>`<br>Iterator that returns the same set of elements always. |
| [SyncIterator](-sync-iterator/index.html) | `class SyncIterator<out T> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`T`](-sync-iterator/index.html#T)`>`<br>Synchronized [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) implementation using a [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) either provided to the constructor or an internally created [ReentrantReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReentrantReadWriteLock.html). The [ReadWriteLock](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/locks/ReadWriteLock.html) is used to synchronize read calls to [SyncIterator.hasNext](-sync-iterator/has-next.html) against write calls to [SyncIterator.next](-sync-iterator/next.html) and write calls to any other read or write calls. |

