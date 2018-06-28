[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [InheritanceLevel](./index.md)

# InheritanceLevel

`class InheritanceLevel : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>`

Calculates number of superclasses between base and derived class.

This class is thread safe.

Result interpretation:

* [Integer.MIN_VALUE](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#MIN_VALUE) -&amp;gt; classes are not related. (ex. matching FileNotFoundException with RuntimeException);
* 0 -&amp;gt; classes are identical. (ex. matching IOException with IOException);
* 1 -&amp;gt; single level inheritance. (ex. matching FileNotFoundException with IOException);
* 2 -&amp;gt; two inheritance levels. (ex. matching FileNotFoundException with Exception).

### Parameters

`derived` - Derived class

`base` - Base class

**Since**
0.4

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `InheritanceLevel(derived: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<*>, base: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<*>)`<br>Calculates number of superclasses between base and derived class. |

### Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | `fun invoke(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
