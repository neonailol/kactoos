# Kactoos.

[![Build Status](https://travis-ci.org/neonailol/kactoos.svg?branch=master)](https://travis-ci.org/neonailol/kactoos)
[![Build status](https://ci.appveyor.com/api/projects/status/github/neonailol/kactoos?branch=master&svg=true)](https://ci.appveyor.com/project/neonailol/kactoos)
[![Jitpack](https://jitpack.io/v/neonailol/kactoos.svg)](https://jitpack.io/#neonailol/kactoos)
[![Active Contributors](https://api.gitential.com/accounts/444/projects/511/badges/active-contributors.svg)](https://gitential.com/accounts/444/projects/511/share?uuid=5d5264cf-c89c-4168-8eee-9ab8f75a8802&utm_source=shield&utm_medium=shield&utm_campaign=511)
[![Code Volume](https://api.gitential.com/accounts/444/projects/511/badges/code-volume.svg)](https://gitential.com/accounts/444/projects/511/share?uuid=5d5264cf-c89c-4168-8eee-9ab8f75a8802&utm_source=shield&utm_medium=shield&utm_campaign=511)
[![Coding Hours](https://api.gitential.com/accounts/444/projects/511/badges/coding-hours.svg)](https://gitential.com/accounts/444/projects/511/share?uuid=5d5264cf-c89c-4168-8eee-9ab8f75a8802&utm_source=shield&utm_medium=shield&utm_campaign=511)
[![Efficiency](https://api.gitential.com/accounts/444/projects/511/badges/efficiency.svg)](https://gitential.com/accounts/444/projects/511/share?uuid=5d5264cf-c89c-4168-8eee-9ab8f75a8802&utm_source=shield&utm_medium=shield&utm_campaign=511)
[![Utilization](https://api.gitential.com/accounts/444/projects/511/badges/utilization.svg)](https://gitential.com/accounts/444/projects/511/share?uuid=5d5264cf-c89c-4168-8eee-9ab8f75a8802&utm_source=shield&utm_medium=shield&utm_campaign=511)

Reworked to Kotlin version of [Cactoos](http://www.cactoos.org)

## Usage

Kactoos intended to be used as drop-in replacement for Cactoos, this statement backed by [compatibility tests](compatibility-tests)

## Examples

Write to file, read it contents, and compare it with original

```kotlin
val temp = Files.createTempFile("kactoos-1", "txt-1")
val identical = Equals(
    {
        TextOf(
            TeeInput(
                InputOf(
                    BytesOf(
                        TextOf("Hello, world!")
                    )
                ),
                WriterAsOutput(
                    WriterTo(temp)
                )
            )
        ).asString()
    },
    { "Hello, world!" }
).invoke()
```

## Purpose

Target platforms other than jvm, specifically [kotlin-js](https://kotlinlang.org/docs/reference/js-overview.html) and [kotlin-native](https://kotlinlang.org/docs/reference/native-overview.html)

## Some implementation notes

* Do no use [@JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/) and default arguments in functions and constructors as it's not portable

