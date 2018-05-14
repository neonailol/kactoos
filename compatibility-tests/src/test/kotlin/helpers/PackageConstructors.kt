package helpers

import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.iterable.Filtered
import nnl.rocks.kactoos.iterable.IterableOf
import nnl.rocks.kactoos.list.Joined
import nnl.rocks.kactoos.list.Mapped
import nnl.rocks.kactoos.list.Sorted
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import java.lang.reflect.Constructor

class PackageConstructors(
    private val decorated: List<String>
) : List<String> by decorated {

    constructor(pkg: String) : this(
        Sorted(
            Filtered(
                FuncOf({ it: String -> it.contains("\$").not() }),
                Mapped(
                    FuncOf({ it: Constructor<*> -> it.toString().replace("$pkg.", "") }),
                    Joined(
                        IterableOf(
                            Mapped(
                                FuncOf({ it: Class<*> -> it.constructors.asList() }),
                                Reflections(
                                    pkg,
                                    SubTypesScanner(false)
                                ).getSubTypesOf(Any::class.java)
                            )
                        )
                    )
                )
            )
        )
    )
}
