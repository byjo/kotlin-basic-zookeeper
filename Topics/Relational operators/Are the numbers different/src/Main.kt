fun main() {
    val value1 = readln().toInt()
    val value2 = readln().toInt()
    val value3 = readln().toInt()

    val flag = value1 != value2 && value2 != value3 && value1 != value3
    println(flag)
}