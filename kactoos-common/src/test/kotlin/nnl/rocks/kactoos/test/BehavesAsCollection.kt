package nnl.rocks.kactoos.test

class BehavesAsCollection<T : Any>(
    origin: Collection<T>,
    expected: Array<T>,
    iterations: Int = 3
) {

    init {
        BehavesAsIterable(origin, expected, iterations)
    }
}
