[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [AvgOf](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`AvgOf(vararg src: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`
`AvgOf(vararg src: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)`
`AvgOf(vararg src: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`)`
`AvgOf(vararg src: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`)`
`AvgOf(vararg src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`>)`

Ctor.

### Parameters

`src` - Numbers`AvgOf(src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Number`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-number/index.html)`>>)`

Average of numbers.

Here is how you can use it to fine mathematical average of numbers:

``` java
int sum = new AvgOf(1, 2, 3, 4).intValue();
long sum = new AvgOf(1L, 2L, 3L).longValue();
int sum = new AvgOf(numbers.toArray(new Integer[numbers.size()])).intValue();
```

This class implements [Scalar](../../nnl.rocks.kactoos/-scalar/index.md), which throws a checked
[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). This may not be convenient in many cases. To make
it more convenient and get rid of the checked exception you can
use [UncheckedScalar](../-unchecked-scalar/index.md) or [IoCheckedScalar](../-io-checked-scalar/index.md) decorators.

There is no thread-safety guarantee.

### Parameters

`src` - The iterable

**Since**
0.24

