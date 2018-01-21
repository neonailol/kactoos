[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [InputWithFallback](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, alt: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`
`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, alt: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<IOException, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>)`

### Parameters

`input` - Main input

`alt` - Alternative`InputWithFallback(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)``InputWithFallback(main: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`, alternative: `[`IoCheckedFunc`](../../nnl.rocks.kactoos.func/-io-checked-func/index.md)`<IOException, `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`>)`

Input that returns an alternative input if the main one throws
[IOException](#).

There is no thread-safety guarantee.

**Since**
0.9

