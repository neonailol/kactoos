package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.IoCheckedFunc
import nnl.rocks.kactoos.text.FormattedText
import java.io.IOException
import java.io.InputStream

/**
 * Classpath resource.
 *
 * Pay attention that the name of resource must always be
 * global, **not** starting with a leading slash. Thus,
 * if you want to load a text file from `/com/example/Test.txt`,
 * you must provide this name: `"com/example/Test.txt"`.
 *
 * @see ClassLoader.getResource
 * @since 0.1
 */
class ResourceOf(
    private val path: CharSequence,
    private val fallback: Func<CharSequence, Input>,
    private val loader: ClassLoader
) : Input {

    constructor(
        path: CharSequence,
        fallback: Func<CharSequence, Input>
    ) : this(
        path,
        fallback,
        Thread.currentThread().contextClassLoader
    )

    /**
     * New resource input with current context [ClassLoader].
     * @param res Resource name
     * @param fbk Fallback
     */
    constructor(
        res: CharSequence,
        fbk: CharSequence
    ) : this(res, FuncOf { input -> InputOf(BytesOf(fbk)) })

    /**
     * New resource input with current context [ClassLoader].
     * @param res Resource name
     * @param fbk Fallback
     */
    constructor(
        res: CharSequence,
        fbk: Input
    ) : this(res, FuncOf { input -> fbk })

    /**
     * New resource input with specified [ClassLoader].
     * @param res Resource name
     * @param ldr Resource class loader
     */
    constructor(
        res: CharSequence,
        ldr: ClassLoader
    ) : this(
        res,
        FuncOf { input ->
            throw IOException(
                FormattedText(
                    "Resource \"%s\" was not found",
                    input
                ).asString()
            )
        },
        ldr
    )

    constructor(res: CharSequence) : this(res, Thread.currentThread().contextClassLoader)

    @Throws(IOException::class)
    override fun stream(): InputStream {
        var input: InputStream? = this.loader.getResourceAsStream(
            this.path.toString()
        )
        if (input == null) {
            input = IoCheckedFunc(this.fallback)
                .apply(this.path)
                .stream()
        }
        return input
    }
}
