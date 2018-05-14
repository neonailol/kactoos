[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TempFile](./index.md)

# TempFile

`class TempFile : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, `[`Closeable`](http://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)

A temporary file.

These are ephemeral files to be used in small scopes.
Typical use looks like this:

```
try (final TempFile file = new TempFile()) {
    //write to the file
}
```

The physical file is deleted from the filesystem when the temp file is
closed.

### Parameters

`file` - Creates the file and returns the path to it

**Since**
0.3

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TempFile(prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "", suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = "")`<br>The temporary file will be created inside the filesystem's temporary folder (system property: `java.io.tmpdir`).`TempFile(dir: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, suffix: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`TempFile(dir: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<`[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)`>, prefix: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`, suffix: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)` |

### Functions

| Name | Summary |
|---|---|
| [close](close.md) | `fun close(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Deletes the file from the filesystem. |
| [invoke](invoke.md) | `fun invoke(): `[`Path`](http://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)<br>Get value of this [Scalar](../../nnl.rocks.kactoos/-scalar/index.md) |
