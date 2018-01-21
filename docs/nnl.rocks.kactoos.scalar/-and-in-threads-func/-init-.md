[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [AndInThreadsFunc](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`AndInThreadsFunc(service: ExecutorService, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`
`AndInThreadsFunc(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)``AndInThreadsFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, vararg src: X)`

### Parameters

`proc` - Proc to map

`src` - The iterable

`X` - Type of items in the iterable`AndInThreadsFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: X)`

### Parameters

`func` - Func to map

`src` - The iterable

`X` - Type of items in the iterable`AndInThreadsFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`
`AndInThreadsFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`

### Parameters

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable`AndInThreadsFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`
`AndInThreadsFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`

### Parameters

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable`AndInThreadsFunc(svc: ExecutorService, proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, vararg src: X)`

### Parameters

`svc` - Executable service to run thread in

`proc` - Proc to map

`src` - The iterable

`X` - Type of items in the iterable`AndInThreadsFunc(svc: ExecutorService, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: X)`

### Parameters

`svc` - Executable service to run thread in

`func` - Func to map

`src` - The iterable

`X` - Type of items in the iterable`AndInThreadsFunc(svc: ExecutorService, proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`

### Parameters

`svc` - Executable service to run thread in

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable`AndInThreadsFunc(svc: ExecutorService, proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<X>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`

Ctor.

### Parameters

`svc` - Executable service to run thread in

`src` - The iterable

`proc` - Proc to use

`X` - Type of items in the iterable`AndInThreadsFunc(svc: ExecutorService, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)`
`AndInThreadsFunc(svc: ExecutorService, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<X>)`

Ctor.

### Parameters

`svc` - Executable service to run thread in

`src` - The iterable

`func` - Func to map

`X` - Type of items in the iterable`AndInThreadsFunc(service: ExecutorService, iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>, shut: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`

Logical conjunction, in multiple threads.

This class can be effectively used to iterate through a collection, just like [java.util.stream.Stream.forEach](#) works:

```
new AndInThreads(
new IterableOf("Mary", "John", "William", "Napkin"),
name -> System.out.printf("The name: %s\n", name)
).value();
```

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

There is no thread-safety guarantee.

### Parameters

`service` - Executable service to run thread in

`iterable` - The iterable

`shut` - Shut it down

`X` - Type of items in the iterable

**See Also**

[UncheckedScalar](../-unchecked-scalar/index.md)

[IoCheckedScalar](../-io-checked-scalar/index.md)

**Since**
0.25

