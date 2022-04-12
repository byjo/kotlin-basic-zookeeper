fun main() {
    val number = readln().toInt()
    var max = 0

    repeat(number) {
        val candidate = readln().toInt()
        if (candidate % 4 == 0 && candidate > max) {
            max = candidate
        }
    }

    println("$max")
}