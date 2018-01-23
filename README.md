# Kactoos.

[![Build Status](https://travis-ci.org/neonailol/kactoos.svg?branch=master)](https://travis-ci.org/neonailol/kactoos)
[![Build status](https://ci.appveyor.com/api/projects/status/github/neonailol/kactoos?branch=master&svg=true)](https://ci.appveyor.com/project/neonailol/kactoos)
[![Jitpack](https://jitpack.io/v/neonailol/kactoos.svg)](https://jitpack.io/#neonailol/kactoos)
[![Active Contributors](https://api.gitential.com/accounts/444/projects/510/badges/active-contributors.svg)](https://gitential.com/accounts/444/projects/510/share?uuid=ae2a4c19-7845-4099-99b7-e3c99d126749&utm_source=shield&utm_medium=shield&utm_campaign=510)
[![Code Volume](https://api.gitential.com/accounts/444/projects/510/badges/code-volume.svg)](https://gitential.com/accounts/444/projects/510/share?uuid=ae2a4c19-7845-4099-99b7-e3c99d126749&utm_source=shield&utm_medium=shield&utm_campaign=510)
[![Coding Hours](https://api.gitential.com/accounts/444/projects/510/badges/coding-hours.svg)](https://gitential.com/accounts/444/projects/510/share?uuid=ae2a4c19-7845-4099-99b7-e3c99d126749&utm_source=shield&utm_medium=shield&utm_campaign=510)
[![Efficiency](https://api.gitential.com/accounts/444/projects/510/badges/efficiency.svg)](https://gitential.com/accounts/444/projects/510/share?uuid=ae2a4c19-7845-4099-99b7-e3c99d126749&utm_source=shield&utm_medium=shield&utm_campaign=510)
[![Utilization](https://api.gitential.com/accounts/444/projects/510/badges/utilization.svg)](https://gitential.com/accounts/444/projects/510/share?uuid=ae2a4c19-7845-4099-99b7-e3c99d126749&utm_source=shield&utm_medium=shield&utm_campaign=510)

Reworked to Kotlin version of [Cactoos](http://www.cactoos.org)

## Usage

Kactoos intended to be used as drop-in replacement for Cactoos, this statement backed by [compatibility tests](compatibility-tests)

## Examples

Write to file, read it contents, and compare it with original

```kotlin
val temp = Files.createTempFile("kactoos-1", "txt-1")
Equals(
    ScalarOf(
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
    ),
    ScalarOf("Hello, world!")
)
```

## Purpose

Target platforms other than jvm, specifically [kotlin-js](https://kotlinlang.org/docs/reference/js-overview.html) and [kotlin-native](https://kotlinlang.org/docs/reference/native-overview.html)

## Changes to Java interoperability

Unfortunately Kotlin does not support additional generic parameters on secondary constructors.<br />
So some classes have been split into two parts with and without generic parameter.<br />
For Kotlin no changes in necessary, as library uses workaround to overcome this issue.<br />  

* Move generic parts of [And](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/And.kt) to [AndFunc](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndFunc.kt)
* Move generic parts of [AndInThreads](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndInThreads.kt) to [AndInThreadsFunc](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndInThreadsFunc.kt)
* Move generic parts of [AndWithIndex](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndWithIndex.kt) to [AndWithIndexFunc](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/AndWithIndexFunc.kt)
* Move generic parts of [Or](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/Or.kt) to [OrFunc](kactoos-jvm/src/main/kotlin/nnl/rocks/kactoos/scalar/OrFunc.kt)

## Some implementation notes

* Do no use [@JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/) and default arguments in functions and constructors as it's not portable

