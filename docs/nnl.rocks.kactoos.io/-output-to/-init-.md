[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [OutputTo](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`OutputTo(out: KOutput)`

### Parameters

`out` - KOutput

**Since**
0.15

`OutputTo(file: File, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`

### Parameters

`file` - The file

`mkdirs` - Should we do mkdirs beforehand?

**Since**
0.15

`OutputTo(file: File)`
`OutputTo(path: Path)``OutputTo(path: Path, mkdirs: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`

Ctor.

### Parameters

`path` - The path

`mkdirs` - Should we do mkdirs beforehand?

**Since**
0.15

`OutputTo(writer: Writer)`

Ctor.

### Parameters

`writer` - The writer`OutputTo(stream: OutputStream)`

Ctor.

### Parameters

`stream` - The stream`OutputTo(origin: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

An [Output](../../nnl.rocks.kactoos/-output/index.md) that encapsulates other destination for the data.

There is no thread-safety guarantee.

**Since**
0.12

