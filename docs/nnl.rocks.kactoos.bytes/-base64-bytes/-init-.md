---
title: Base64Bytes.<init> - kactoos-jvm
---

[kactoos-jvm](../../index.html) / [nnl.rocks.kactoos.bytes](../index.html) / [Base64Bytes](index.html) / [&lt;init&gt;](./-init-.html)

# &lt;init&gt;

`Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`)`

Uses [Base64.getDecoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64.html#getDecoder()) as [decoder](#)

### Parameters

`origin` - Origin bytes.`Base64Bytes(origin: `[`Bytes`](../../nnl.rocks.kactoos/-bytes/index.html)`, decoder: `[`Decoder`](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Decoder.html)`)`

Decodes all origin bytes using the Base64 encoding scheme.

### Parameters

`origin` - Origin bytes.

`decoder` - Which [Base64.Decoder](http://docs.oracle.com/javase/8/docs/api/java/util/Base64/Decoder.html) to use.

**Since**
0.3

