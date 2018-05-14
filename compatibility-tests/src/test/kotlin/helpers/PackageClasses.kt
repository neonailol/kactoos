package helpers

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.collection.Filtered
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.list.Mapped
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner

open class PackageClasses(
    private val decorated: List<String>
) : List<String> by decorated {

    constructor(
        pkg: String,
        filter: Func<String, Boolean>
    ) : this(
        Mapped(
            FuncOf({ it: String -> it.replace("$pkg.", "") }),
            Filtered(
                filter,
                Reflections(
                    pkg,
                    SubTypesScanner(false)
                ).allTypes
            )
        )
    )
}

class CactoosClasses : PackageClasses("org.cactoos", FuncOf({ it: String -> it.contains('$').not() }))
class KactoosClasses : PackageClasses("nnl.rocks.kactoos", FuncOf({ it: String -> it.endsWith("Kt").not() }))
