[kactoos-jvm](../../index.md) / [nnl.rocks.kactoos](../index.md) / [Input](.)

# Input

`@FunctionalInterface interface Input` [(source)](https://github.com/neonailol/kactoos/blob/master/kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/Input.kt#L29)

Input.

Here is for example how Input can be used
in order to read the content of a text file:

```
String content = new TextOf(
  new InputOf(new File("/tmp/names.txt"))
).asString();
```

Here [nnl.rocks.kactoos.io.InputOf](../../nnl.rocks.kactoos.io/-input-of/index.md) implements
Input and behaves like
one, providing read-only access to
the encapsulated [java.io.File](#).

There is no thread-safety guarantee.

**See Also**

[nnl.rocks.kactoos.io.InputOf](../../nnl.rocks.kactoos.io/-input-of/index.md)

**Since**
0.1

### Functions

| Name | Summary |
|---|---|
| [stream](stream.md) | `abstract fun stream(): InputStream`<br>Get read access to it. |

### Inheritors

| Name | Summary |
|---|---|
| [DeadInput](../../nnl.rocks.kactoos.io/-dead-input/index.md) | `class DeadInput : Input`<br>Input with no data. |
| [InputOf](../../nnl.rocks.kactoos.io/-input-of/index.md) | `class InputOf : Input`<br>An Input that encapsulates other sources of data. |
| [InputWithFallback](../../nnl.rocks.kactoos.io/-input-with-fallback/index.md) | `class InputWithFallback : Input`<br>Input that returns an alternative input if the main one throws [IOException](#). |
| [ResourceOf](../../nnl.rocks.kactoos.io/-resource-of/index.md) | `class ResourceOf : Input`<br>Classpath resource. |
| [StdinInput](../../nnl.rocks.kactoos.io/-stdin-input/index.md) | `class StdinInput : Input`<br>Input that reads from `stdin`. |
| [StickyInput](../../nnl.rocks.kactoos.io/-sticky-input/index.md) | `class StickyInput : Input`<br>Input that reads only once. |
| [SyncInput](../../nnl.rocks.kactoos.io/-sync-input/index.md) | `class SyncInput : Input`<br>Thread-safe Input. |
| [TeeInput](../../nnl.rocks.kactoos.io/-tee-input/index.md) | `class TeeInput : Input`<br>Input to Output copying pipe. |
| [UncheckedInput](../../nnl.rocks.kactoos.io/-unchecked-input/index.md) | `class UncheckedInput : Input`<br>Input that doesn't throw checked [Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html). |
