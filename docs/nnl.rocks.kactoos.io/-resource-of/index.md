[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [ResourceOf](./index.md)

# ResourceOf

`class ResourceOf : `[`Input`](../../nnl.rocks.kactoos/-input/index.md)

Classpath resource.

Pay attention that the name of resource must always be
global, **not** starting with a leading slash. Thus,
if you want to load a text file from `/com/example/Test.txt`,
you must provide this name: `"com/example/Test.txt"`.

### Parameters

`path` - Resource name

`fallback` - Resource class loader

`loader` - Fallback

**See Also**

[ClassLoader.getResource](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html#getResource(java.lang.String))

**Since**
0.1

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, ldr: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>, ldr: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>`ResourceOf(res: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, ldr: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>New resource input with specified [ClassLoader](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html).`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`ResourceOf(res: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, fbk: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`ResourceOf(res: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, fbk: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>New resource input with current context [ClassLoader](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html).`ResourceOf(path: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>, loader: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>Classpath resource. |

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |
