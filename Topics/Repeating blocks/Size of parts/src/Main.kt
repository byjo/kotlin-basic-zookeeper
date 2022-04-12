fun main() {
    val number = readln().toInt()
    var perfect = 0
    var larger = 0
    var smaller = 0

    repeat(number) {
        val input = readln().toInt()
        if (input == 1) larger++
        if (input == -1) smaller++
        if (input == 0) perfect++
    }

    println("$perfect $larger $smaller")
}