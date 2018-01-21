package nnl.rocks.kactoos

    /**
     * Alias for [Scalar]
     * @since 0.2
     */
internal typealias KScalar<T> = () -> T

    /**
     * Alias for [Proc]
     * @since 0.2
     */
internal typealias KProc<X> = (X) -> Unit

    /**
     * Alias for [Text]
     * @since 0.2
     */
internal typealias KText = () -> String

    /**
     * Alias for [BiFunc]
     * @since 0.2
     */
internal typealias KBiFunc<X, Y, Z> = (X, Y) -> Z

    /**
     * Alias for [Func]
     * @since 0.2
     */
internal typealias KFunc<X, Y> = (X) -> Y

    /**
     * Alias for [BiProc]
     * @since 0.2
     */
internal typealias KBiProc<X, Y> = (X, Y) -> Unit

    /**
     * Alias for [Bytes]
     * @since 0.2
     */
internal typealias KBytes = () -> ByteArray
