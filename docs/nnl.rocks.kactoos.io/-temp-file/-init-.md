[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TempFile](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TempFile(prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "")`

The temporary file will be created inside the filesystem's
temporary folder (system property: `java.io.tmpdir`).

### Parameters

`prefix` - The temp filename's prefix

`suffix` - The temp filename's suffix`TempFile(dir: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`
`TempFile(dir: `[`KScalar`](../../nnl.rocks.kactoos/-k-scalar.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, suffix: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`

### Parameters

`dir` - The directory in which to create the temp file

`prefix` - The temp filename's prefix

`suffix` - The temp filename's suffix