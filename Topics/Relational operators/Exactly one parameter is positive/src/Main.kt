fun main() {
    val value1 = readln().toInt()
    val value2 = readln().toInt()
    val value3 = readln().toInt()

    val values = listOf(value1, value2, value3)
    val count = values.count { it > 0 }
    val flag = count == 1

    println(flag)
}