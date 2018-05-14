[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [Or](./index.md)

# Or

`class Or : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

Logical disjunction.

There is no thread-safety guarantee.

### Parameters

`origin` - The iterable.

**Since**
0.8

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Or(vararg scalar: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>`Or(iterable: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)``Or(origin: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`<br>Logical disjunction. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, vararg src: `[`X`](invoke.md#X)`): `[`Or`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](invoke.md#X)`): `[`Or`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](invoke.md#X)`>): `[`Or`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](invoke.md#X)`>): `[`Or`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](invoke.md#X)`>): `[`Or`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](invoke.md#X)`>): `[`Or`](./index.md) |
