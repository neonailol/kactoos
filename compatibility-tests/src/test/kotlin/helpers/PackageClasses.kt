package helpers

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.collection.Filtered
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.list.Mapped
import nnl.rocks.kactoos.list.Sorted
import nnl.rocks.kactoos.scalar.And
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner

open class PackageClasses(
    private val decorated: List<String>
) : List<String> by decorated {

    constructor(
        pkg: String,
        filter: Func<String, Boolean>
    ) : this(
        Sorted(
            Mapped(
                FuncOf { it: String -> it.replace("$pkg.", "") },
                Filtered(
                    filter,
                    Reflections(
                        pkg,
                        SubTypesScanner(false)
                    ).allTypes
                )
            )
        )
    )
}

class CactoosClasses : PackageClasses(
    "org.cactoos",
    FuncOf { it: String ->
        And(
            { it.contains('$').not() },
            { it.contains("NoNulls").not() }
        ).invoke()
    }
)

class KactoosClasses : PackageClasses(
    "nnl.rocks.kactoos",
    FuncOf { it: String -> it.endsWith("Kt").not() }
)
