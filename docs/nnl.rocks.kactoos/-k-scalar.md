[kactoos-jvm](../index.md) / [nnl.rocks.kactoos](index.md) / [KScalar](./-k-scalar.md)

# KScalar

`typealias KScalar<T> = () -> `[`T`](-k-scalar.md#T)

Alias for [Scalar](-scalar/index.md)

**Since**
0.2

### Inheritors

| Name | Summary |
|---|---|
| [And](../nnl.rocks.kactoos.scalar/-and/index.md) | `class And : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndFunc](../nnl.rocks.kactoos.scalar/-and-func/index.md) | `class AndFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction. |
| [AndInThreads](../nnl.rocks.kactoos.scalar/-and-in-threads/index.md) | `class AndInThreads : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndInThreadsFunc](../nnl.rocks.kactoos.scalar/-and-in-threads-func/index.md) | `class AndInThreadsFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, in multiple threads. |
| [AndWithIndex](../nnl.rocks.kactoos.scalar/-and-with-index/index.md) | `class AndWithIndex : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [AndWithIndexFunc](../nnl.rocks.kactoos.scalar/-and-with-index-func/index.md) | `class AndWithIndexFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical conjunction, with index. |
| [BoolOf](../nnl.rocks.kactoos.scalar/-bool-of/index.md) | `class BoolOf : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Text as [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html). |
| [Folded](../nnl.rocks.kactoos.scalar/-folded/index.md) | `class Folded<out X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`X`](../nnl.rocks.kactoos.scalar/-folded/index.md#X)`>`<br>Iterable, which elements are "folded" through the func. |
| [ItemAt](../nnl.rocks.kactoos.scalar/-item-at/index.md) | `class ItemAt<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`T`](../nnl.rocks.kactoos.scalar/-item-at/index.md#T)`>`<br>Element from position in [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html) or fallback value if iterator hasn't this position. |
| [NumberOf](../nnl.rocks.kactoos.scalar/-number-of/index.md) | `class NumberOf : `[`NumberEnvelope`](../nnl.rocks.kactoos.scalar/-number-envelope/index.md)`, `[`KScalar`](./-k-scalar.md)`<`[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`>`<br>Text as [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html). |
| [Or](../nnl.rocks.kactoos.scalar/-or/index.md) | `class Or : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [OrFunc](../nnl.rocks.kactoos.scalar/-or-func/index.md) | `class OrFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`<br>Logical disjunction. |
| [PropertiesOf](../nnl.rocks.kactoos.scalar/-properties-of/index.md) | `class PropertiesOf : `[`KScalar`](./-k-scalar.md)`<`[`Properties`](http://docs.oracle.com/javase/8/docs/api/java/util/Properties.html)`>`<br>Map as [java.util.Properties](http://docs.oracle.com/javase/8/docs/api/java/util/Properties.html). |
| [Reduced](../nnl.rocks.kactoos.scalar/-reduced/index.md) | `class Reduced<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`T`](../nnl.rocks.kactoos.scalar/-reduced/index.md#T)`>`<br>Reduce iterable via BiFunc. |
| [RetryScalar](../nnl.rocks.kactoos.scalar/-retry-scalar/index.md) | `class RetryScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`T`](../nnl.rocks.kactoos.scalar/-retry-scalar/index.md#T)`>`<br>Func that will try a few times before throwing an exception. |
| [SolidScalar](../nnl.rocks.kactoos.scalar/-solid-scalar/index.md) | `class SolidScalar<out T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`T`](../nnl.rocks.kactoos.scalar/-solid-scalar/index.md#T)`>`<br>Cached and synchronized version of a KScalar. |
| [StickyScalar](../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md) | `class StickyScalar<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`T`](../nnl.rocks.kactoos.scalar/-sticky-scalar/index.md#T)`>`<br>Cached version of a KScalar. |
| [Ternary](../nnl.rocks.kactoos.scalar/-ternary/index.md) | `class Ternary<T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`KScalar`](./-k-scalar.md)`<`[`T`](../nnl.rocks.kactoos.scalar/-ternary/index.md#T)`>`<br>Ternary operation. |
