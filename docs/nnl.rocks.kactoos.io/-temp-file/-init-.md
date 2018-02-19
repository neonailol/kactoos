---
title: TempFile.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.io](../index.html) / [TempFile](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`TempFile(prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "")`

The temporary file will be created inside the filesystem's
temporary folder (system property: `java.io.tmpdir`).

### Parameters

`prefix` - The temp filename's prefix

`suffix` - The temp filename's suffix`TempFile(dir: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`
`TempFile(dir: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.html)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`, suffix: `[`Text`](../../nnl.rocks.kactoos/-text/index.html)`)`

### Parameters

`dir` - The directory in which to create the temp file

`prefix` - The temp filename's prefix

`suffix` - The temp filename's suffix