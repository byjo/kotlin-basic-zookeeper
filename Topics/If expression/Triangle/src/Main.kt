fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a + b > c && b + c > a && a + c > b) {
        println("YES")
    } else {
        println("NO")
    }
}