[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [ResourceOf](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`ResourceOf(path: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>)`
`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)``ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`)`
`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fbk: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`

New resource input with current context [ClassLoader](#).

### Parameters

`res` - Resource name

`fbk` - Fallback`ResourceOf(res: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, ldr: ClassLoader)`

New resource input with specified [ClassLoader](#).

### Parameters

`res` - Resource name

`ldr` - Resource class loader`ResourceOf(path: `[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, fallback: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`CharSequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-sequence/index.html)`, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>, loader: ClassLoader)`

Classpath resource.

Pay attention that the name of resource must always be
global, **not** starting with a leading slash. Thus,
if you want to load a text file from `/com/example/Test.txt`,
you must provide this name: `"com/example/Test.txt"`.

**See Also**

[ClassLoader.getResource](#)

**Since**
0.1

