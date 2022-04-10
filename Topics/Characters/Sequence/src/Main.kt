fun main() {
    val value1 = readln().first()
    val value2 = readln().first()
    val value3 = readln().first()

    val flag = value2 == value1 + 1 && value3 == value2 + 1
    println(flag)
}