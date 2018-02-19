---
title: AndFunc.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [AndFunc](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`AndFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, vararg src: `[`X`](index.html#X)`)`

### Parameters

`proc` - Proc to map

`src` - The iterable

`X` - Type of items in the iterable`AndFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`

### Parameters

`func` - Func to map

`src` - The iterable

`X` - Type of items in the iterable`AndFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`
`AndFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable

**Since**
0.24

`AndFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`
`AndFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`

### Parameters

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable

**Since**
0.24

`AndFunc(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`

Logical conjunction.

This class can be effectively used to iterate through
a collection, just like [java.util.stream.Stream.forEach](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#forEach(java.util.function.Consumer<? super T>)) works:

```
new And(
  new IterableOf("Mary", "John", "William", "Napkin"),
  name -> System.out.printf("The name: %s\n", name)
).value();
```

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.html), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.html) or [IoCheckedScalar](../-io-checked-scalar/index.html) decorators.

There is no thread-safety guarantee.

### Parameters

`iterable` - The iterable

`X` - Type argument

**See Also**

[UncheckedScalar](../-unchecked-scalar/index.html)

[IoCheckedScalar](../-io-checked-scalar/index.html)

**Since**
0.8

