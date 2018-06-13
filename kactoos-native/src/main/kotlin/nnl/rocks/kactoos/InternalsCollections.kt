package kotlin.collections

internal class Random() {
    companion object {
        var seedInt = 0
        fun nextInt(boundary: Int = 100): Int {
            seedInt = (3 * seedInt + 11) % boundary
            return seedInt
        }

        var seedDouble: Double = 0.1
        fun nextDouble(boundary: Double = 100.0): Double {
            seedDouble = (7.0 * seedDouble + 7.0) % boundary
            return seedDouble
        }
    }
}

internal fun <T> Iterable<T>.shuffled(): List<T> = toMutableList().apply { shuffle() }

internal fun <T> MutableList<T>.shuffle(): Unit {
    for (i in lastIndex downTo 1) {
        val j = Random.nextInt(i + 1)
        val copy = this[i]
        this[i] = this[j]
        this[j] = copy
    }
}
