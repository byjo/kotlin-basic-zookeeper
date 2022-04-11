fun main() {
    val input = readln().toInt()
    val numbers = listOf(2, 3, 5, 6)

    for (number in numbers) {
        if (input % number == 0) {
            println("Divided by $number")
        }
    }
}