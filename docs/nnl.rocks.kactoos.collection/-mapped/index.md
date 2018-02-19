---
title: Mapped - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.collection](../index.html) / [Mapped](./index.html)

# Mapped

`class Mapped<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`CollectionEnvelope`](../-collection-envelope/index.html)`<`[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/collection/Mapped.kt#L17)

Mapped collection.

There is no thread-safety guarantee.

### Parameters

`X` - Type of source item

`Y` - Type of target item

**Since**
0.3

### Constructors

| [&lt;init&gt;](-init-.html) | `Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, vararg src: `[`X`](index.html#X)`)`<br>`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`<br>`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>Ctor.`Mapped(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, src: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`X`](index.html#X)`>)`<br>Mapped collection. |

### Functions

| [toString](to-string.html) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

