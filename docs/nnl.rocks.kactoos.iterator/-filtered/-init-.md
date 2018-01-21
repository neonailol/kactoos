[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterator](../index.md) / [Filtered](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>)``Filtered(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, iterator: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<X>, buffer: Queue<X>)`

Filtered iterator.

You can use it in order to create a declarative/lazy
version of a filtered collection/iterable. For example,
this code will create a list of two strings "hello" and "world":

```
Iterator<String>; list = new Filtered<>(
  new ArrayOf<>(
    "hey", "hello", "world"
  ).iterator(),
  input -> input.length() > 4
);
```

There is no thread-safety guarantee.

### Parameters

`X` - Type of item

**See Also**

[Filtered](index.md)

**Since**
0.1

