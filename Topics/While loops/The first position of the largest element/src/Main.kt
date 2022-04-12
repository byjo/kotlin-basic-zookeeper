import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE
    var position = 0
    var maxPosition = 0

    while (scanner.hasNext()) {
        position++

        val value = scanner.next().toInt()
        if (value > max) {
            max = value
            maxPosition = position
        }
    }

    println("$max $maxPosition")
}