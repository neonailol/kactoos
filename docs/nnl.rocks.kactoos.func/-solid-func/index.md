---
title: SolidFunc - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.func](../index.html) / [SolidFunc](./index.html)

# SolidFunc

`class SolidFunc<in X : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, out Y : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/func/SolidFunc.kt#L14)

Func that is thread-safe and sticky.

Objects of this class are thread safe.

### Parameters

`X` - Type of input

`Y` - Type of output

**Since**
0.24

### Constructors

| [&lt;init&gt;](-init-.html) | `SolidFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>, max: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`<br>`SolidFunc(fnc: `[`Func`](../../nnl.rocks.kactoos/-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)``SolidFunc(func: `[`SyncFunc`](../-sync-func/index.html)`<`[`X`](index.html#X)`, `[`Y`](index.html#Y)`>)`<br>Func that is thread-safe and sticky. |

### Functions

| [apply](apply.html) | `fun apply(input: `[`X`](index.html#X)`): `[`Y`](index.html#Y)<br>Apply it. |

