[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.func](../index.md) / [ChainedFunc](.)

# ChainedFunc

`class ChainedFunc<X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, Z : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Z>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/ChainedFunc.kt#L16)

Composed function.

### Parameters

`before` - Before function

`functions` - Functions

`after` - After function

`X` - Type of input.

`Y` - Intermediate type.

`Z` - Type of output.

**Since**
0.7

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ChainedFunc(bfr: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, atr: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Z>)``ChainedFunc(before: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<X, Y>, functions: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Y>>, after: `[`Func`](../../nnl.rocks.kactoos/-func/index.md)`<Y, Z>)`<br>Composed function. |

### Functions

| Name | Summary |
|---|---|
| [apply](apply.md) | `fun apply(input: X): Z`<br>Apply it. |
