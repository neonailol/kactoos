[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos.io](../index.md) / [TailInput](index.md) / [copyPartial](./copy-partial.md)

# copyPartial

`private fun copyPartial(buffer: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, response: `[`ByteArray`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte-array/index.html)`, num: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, read: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Copy buffer to response for read count smaller then buffer size.

### Parameters

`buffer` - The buffer array

`response` - The response array

`num` - Number of bytes in response array from previous read

`read` - Number of bytes read in the buffer

**Return**
New count of bytes in the response array

**Checkstyle**
ParameterNumberCheck (3 lines)

