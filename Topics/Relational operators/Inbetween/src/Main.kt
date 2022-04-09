fun main() {
    val value1 = readln().toInt()
    val value2 = readln().toInt()
    val value3 = readln().toInt()

    val flag = (value1 in value2..value3) || (value1 in value3..value2)
    println(flag)
}