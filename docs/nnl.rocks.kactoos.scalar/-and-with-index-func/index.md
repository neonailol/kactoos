---
title: AndWithIndexFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.scalar](../index.html) / [AndWithIndexFunc](./index.html)

# AndWithIndexFunc

`class AndWithIndexFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndWithIndexFunc.kt#L41)

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

### Constructors

| [&lt;init&gt;](-init-.html) | `AndWithIndexFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.html)`<`[`X`](index.html#X)`>, vararg src: `[`X`](index.html#X)`)`<br>`AndWithIndexFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](index.html#X)`)`<br>`AndWithIndexFunc(proc: `[`BiProc`](../../nnl.rocks.kactoos/-bi-proc/index.html)`<`[`X`](index.html#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)`<br>`AndWithIndexFunc(func: `[`BiFunc`](../../nnl.rocks.kactoos/-bi-func/index.html)`<`[`X`](index.html#X)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](index.html#X)`>)``AndWithIndexFunc(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`<br>Logical conjunction, with index. |

### Functions

| [value](value.html) | `fun value(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Convert it to the value. |

