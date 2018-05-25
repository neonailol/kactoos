[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [And](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`And(vararg src: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`
`And(vararg src: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>)`
`And(src: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)``And(iterable: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>)`

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

