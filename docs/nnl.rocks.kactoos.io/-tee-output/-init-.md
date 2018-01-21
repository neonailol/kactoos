[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TeeOutput](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: Writer, charset: Charset)`

### Parameters

`tgt` - The target

`cpy` - The copy destination

`charset` - The charset`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: Writer)`
`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: Path)`
`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: File)`
`TeeOutput(tgt: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, cpy: OutputStream)`

### Parameters

`tgt` - The target

`cpy` - The copy destination`TeeOutput(target: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`, copy: `[`Output`](../../nnl.rocks.kactoos/-output/index.md)`)`

Output to Output copying pipe.

There is no thread-safety guarantee.

**Since**
0.16

