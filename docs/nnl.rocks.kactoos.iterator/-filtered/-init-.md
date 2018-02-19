---
title: Filtered.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.iterator](../index.html) / [Filtered](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)``Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>, buffer: `[`Queue`](http://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)`<`[`X`](index.html#X)`>)`

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

[Filtered](index.html)

**Since**
0.1

