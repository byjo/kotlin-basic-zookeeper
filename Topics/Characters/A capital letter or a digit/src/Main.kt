fun main() {
    val value = readln().first()
    println(value.isUpperCase() || value in '1'..'9')
}