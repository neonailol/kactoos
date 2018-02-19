---
title: AndInThreadsFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [AndInThreadsFunc](./index.html)

# AndInThreadsFunc

`class AndInThreadsFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndInThreadsFunc.kt#L39)

Logical conjunction, in multiple threads.

This class can be effectively used to iterate through a collection, just like [java.util.stream.Stream.forEach](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#forEach(java.util.function.Consumer<? super T>)) works:

```
new AndInThreads(
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

`service` - Executable service to run thread in

`iterable` - The iterable

`shut` - Shut it down

`X` - Type of items in the iterable

**See Also**

[UncheckedScalar](../-unchecked-scalar/index.html)

[IoCheckedScalar](../-io-checked-scalar/index.html)

**Since**
0.25

### Constructors

| [&lt;init&gt;](-init-.html) | `AndInThreadsFunc(service: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`<br>`AndInThreadsFunc(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`<br>`AndInThreadsFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, vararg src: `[`X`](index.html#X)`)`<br>`AndInThreadsFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`<br>`AndInThreadsFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`<br>`AndInThreadsFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>`AndInThreadsFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`<br>`AndInThreadsFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>`AndInThreadsFunc(svc: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, vararg src: `[`X`](index.html#X)`)`<br>`AndInThreadsFunc(svc: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`<br>`AndInThreadsFunc(svc: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)``AndInThreadsFunc(svc: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>`AndInThreadsFunc(svc: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](index.html#X)`>)`<br>`AndInThreadsFunc(svc: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>Ctor.`AndInThreadsFunc(service: `[`ExecutorService`](http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html)`, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>, shut: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>Logical conjunction, in multiple threads. |

### Functions

| [value](value.html) | `fun value(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert it to the value. |

