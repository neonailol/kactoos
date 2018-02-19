---
title: AndWithIndexFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [AndWithIndexFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`AndWithIndexFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, vararg src: `[`X`](index.html#X)`)`

### Parameters

`proc` - Proc to map

`src` - The iterable

`X` - Type of items in the iterable`AndWithIndexFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`

### Parameters

`func` - Func to map

`src` - The iterable

`X` - Type of items in the iterable`AndWithIndexFunc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable

**Since**
0.24

`AndWithIndexFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable

**Since**
0.24

`AndWithIndexFunc(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`

Logical conjunction, with index.

This class can be effectively used to iterate through a collection,
just like [java.util.stream.Stream.forEach](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#forEach(java.util.function.Consumer<? super T>)) works,
but with an index provided for each item:

```
new And(
  new IterableOf("Mary", "John", "William", "Napkin"),
  new BiFuncOf<>(
    (text, index) -> System.out.printf("Name #%d: %s\n", index, text),
    true
  )
).value();
```

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

There is no thread-safety guarantee.

### Parameters

`iterable` - The iterable.

`X` - Generic type.

**Since**
0.20

