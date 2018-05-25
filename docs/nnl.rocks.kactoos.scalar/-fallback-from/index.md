[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [FallbackFrom](./index.md)

# FallbackFrom

`class FallbackFrom<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`T`](index.md#T)`>`

Fallback from exception.

There is no thread-safety guarantee.

### Parameters

`T` - Type of result

`exceptions` - The list of exceptions supported by this instance.

`func` - Function that converts exceptions to the required type.

**Since**
0.5

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FallbackFrom(exp: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`T`](index.md#T)`>)``FallbackFrom(exceptions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>>, func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`T`](index.md#T)`>)`<br>Fallback from exception. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`T`](index.md#T)<br>Apply it. |
| [support](support.md) | `fun support(target: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Calculate level of support of the given exception type. |
