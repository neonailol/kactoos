[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.iterable](../index.md) / [PropertiesOf](.)

# PropertiesOf

`class PropertiesOf : `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<Properties>` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/iterable/PropertiesOf.kt#L27)

Map as [java.util.Properties](#).

There is no thread-safety guarantee.

**Since**
0.12

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `PropertiesOf(sclr: `[`Scalar`](../../nnl.rocks.kactoos/-scalar/index.md)`<Properties>)`<br>`PropertiesOf(content: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`PropertiesOf(text: `[`Text`](../../nnl.rocks.kactoos/-text/index.md)`)`<br>`PropertiesOf(input: `[`Input`](../../nnl.rocks.kactoos/-input/index.md)`)`<br>`PropertiesOf(vararg entries: `[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<*, *>)`<br>`PropertiesOf(entries: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<*, *>>)`<br>`PropertiesOf(map: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<*, *>)``PropertiesOf(scalar: `[`IoCheckedScalar`](../../nnl.rocks.kactoos.scalar/-io-checked-scalar/index.md)`<Properties>)`<br>Map as [java.util.Properties](#). |

### Functions

| Name | Summary |
|---|---|
| [value](value.md) | `fun value(): Properties`<br>Convert it to the value. |
