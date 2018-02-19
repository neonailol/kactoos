---
title: Filtered - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [Filtered](./index.html)

# Filtered

`class Filtered<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterator/Filtered.kt#L32)

Filtered iterator.

You can use it in order to create a declarative/lazy
version of a filtered collection/iterable. For example,
this code will create a list of two strings "hello" and "world":

```
Iterator<String>; list = new Filtered<>(
  new ArrayOf<>(
    "hey", "hello", "world"
  ).iterator(),
  input -> input.length() > 4
);
```

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**See Also**

[Filtered](./index.md)

**Since**
0.1

### Constructors

| [&lt;init&gt;](-init-.html) | `Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)``Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>, buffer: `[`Queue`](http://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)`<`[`X`](index.html#X)`>)`<br>Filtered iterator. |

### Functions

| [hasNext](has-next.html) | `fun hasNext(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [next](next.html) | `fun next(): `[`X`](index.html#X) |

