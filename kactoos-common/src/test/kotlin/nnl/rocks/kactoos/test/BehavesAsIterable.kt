package nnl.rocks.kactoos.test

class BehavesAsIterable<T : Any>(
    origin: Iterable<T>,
    expected: Array<T>,
    iterations: Int = 3
) {

    init {
        for (i in 0 .. iterations) {
            BehavesAsIterator(origin.iterator(), expected)
        }
    }
}
