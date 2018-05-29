[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [SyncFunc](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`SyncFunc(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`
`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>)`
`SyncFunc(func: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`
`SyncFunc(proc: `[`Proc`](../../nnl.rocks.kactoos/-proc/index.md)`<`[`X`](index.md#X)`>, result: `[`Y`](index.md#Y)`)``SyncFunc(func: `[`KFunc`](../../nnl.rocks.kactoos/-k-func.md)`<`[`X`](index.md#X)`, `[`Y`](index.md#Y)`>, lock: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`)`

Func that is thread-safe.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.4

