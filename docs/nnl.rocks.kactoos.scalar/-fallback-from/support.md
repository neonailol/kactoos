[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.scalar](../index.md) / [FallbackFrom](index.md) / [support](./support.md)

# support

`fun support(target: `[`Class`](http://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Calculate level of support of the given exception type.

### Parameters

`target` - Exception type

**Return**
Level of support: greater or equals to 0 if the target is supported and [Integer.MIN_VALUE](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#MIN_VALUE) otherwise

**See Also**

[InheritanceLevel](../-inheritance-level/index.md)

