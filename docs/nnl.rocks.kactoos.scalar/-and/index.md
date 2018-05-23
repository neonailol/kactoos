[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [And](./index.md)

# And

`class And : `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

Logical conjunction.

This class can be effectively used to iterate through
a collection, just like `forEach` works:

```
And<String>(
    ProcOf { println(it) },
    IterableOf("Mary", "John", "William", "Napkin")
).value()
```

There is no thread-safety guarantee.

### Parameters

`iterable` - The encapsulated iterable

**See Also**

[IoCheckedScalar](../-io-checked-scalar/index.md)

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `And(vararg src: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`<br>`And(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)``And(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`<br>Logical conjunction. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, vararg src: `[`X`](invoke.md#X)`): `[`And`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](invoke.md#X)`>): `[`And`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](invoke.md#X)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](invoke.md#X)`>): `[`And`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, vararg src: `[`X`](invoke.md#X)`): `[`And`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`X`](invoke.md#X)`>): `[`And`](./index.md)<br>`operator fun <X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> invoke(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](invoke.md#X)`>, src: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`X`](invoke.md#X)`>): `[`And`](./index.md) |
