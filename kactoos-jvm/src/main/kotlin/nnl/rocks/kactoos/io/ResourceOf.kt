package nnl.rocks.kactoos.io

import nnl.rocks.kactoos.Func
import nnl.rocks.kactoos.Input
import nnl.rocks.kactoos.Text
import nnl.rocks.kactoos.func.FuncOf
import nnl.rocks.kactoos.func.IoCheckedFunc
import nnl.rocks.kactoos.text.FormattedText
import nnl.rocks.kactoos.text.TextOf
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
 * @param path Resource name
 * @param fallback Resource class loader
 * @param loader Fallback
 * @since 0.1
 */
class ResourceOf
constructor(
    private val path: Text,
    private val fallback: Func<Text, Input>,
    private val loader: ClassLoader = Thread.currentThread().contextClassLoader
) : Input {

    /**
     * New resource input with specified [ClassLoader].
     * @param res Resource name
     * @param ldr Resource class loader
     */
    constructor(
        res: CharSequence,
        ldr: ClassLoader = Thread.currentThread().contextClassLoader
    ) : this(TextOf(res), ldr)

    /**
     * New resource input with specified [ClassLoader].
     * @param res Resource name
     * @param ldr Resource class loader
     * @param fbk Fallback
     */
    constructor(
        res: CharSequence,
        fbk: Func<CharSequence, Input>,
        ldr: ClassLoader = Thread.currentThread().contextClassLoader
    ) : this(TextOf(res), FuncOf { input -> fbk.apply(input.asString()) }, ldr)

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
        res: Text,
        ldr: ClassLoader = Thread.currentThread().contextClassLoader
    ) : this(
        res,
        FuncOf { input ->
            throw IOException(
                FormattedText(
                    "Resource \"%s\" was not found",
                    input.asString()
                ).asString()
            )
        },
        ldr
    )

    /**
     * New resource input with current context [ClassLoader].
     * @param res Resource name
     * @param fbk Fallback
     */
    constructor(
        res: Text,
        fbk: Text
    ) : this(res, FuncOf { input -> InputOf(BytesOf(fbk.asString())) })

    /**
     * New resource input with current context [ClassLoader].
     * @param res Resource name
     * @param fbk Fallback
     */
    constructor(
        res: Text,
        fbk: Input
    ) : this(res, FuncOf { input -> fbk })

    @Throws(IOException::class)
    override fun stream(): InputStream {
        var input: InputStream? = this.loader.getResourceAsStream(
            this.path.asString()
        )
        if (input == null) {
            input = IoCheckedFunc(this.fallback)
                .apply(this.path)
                .stream()
        }
        return input
    }
}
