---
title: ResourceOf - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [ResourceOf](./index.html)

# ResourceOf

`class ResourceOf : `[`Input`](../../nnl.rocks.kactoos/-input/index.html) [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/io/ResourceOf.kt#L27)

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

| [&lt;init&gt;](-init-.html) | `ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, ldr: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>, ldr: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>`ResourceOf(res: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, ldr: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>New resource input with specified [ClassLoader](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html).`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`<br>`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`<br>`ResourceOf(res: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, fbk: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`<br>`ResourceOf(res: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, fbk: `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`)`<br>New resource input with current context [ClassLoader](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html).`ResourceOf(path: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.html)`>, loader: `[`ClassLoader`](http://docs.oracle.com/javase/8/docs/api/java/lang/ClassLoader.html)` = Thread.currentThread().contextClassLoader)`<br>Classpath resource. |

### Functions

| [stream](stream.html) | `fun stream(): `[`InputStream`](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)<br>Get read access to it. |

