import kotlin.math.ceil

fun main() {
    val students1 = readln().toInt()
    val students2 = readln().toInt()
    val students3 = readln().toInt()

    println((ceil(students1 / 2.0) + ceil(students2 / 2.0) + ceil(students3 / 2.0)).toInt())
}