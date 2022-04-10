import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val first = scanner.next().first()
    val second = scanner.next().first()

    println(first.uppercaseChar() == second.uppercaseChar())
}