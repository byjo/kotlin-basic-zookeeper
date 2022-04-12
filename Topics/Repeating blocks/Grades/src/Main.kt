fun main() {
    val number = readln().toInt()
    val map = HashMap<Int, Int>()

    repeat(number) {
        val input = readln().toInt()
        map[input] = map.getOrDefault(input, 0) + 1
    }

    println("${map.getOrDefault(2, 0)} ${map.getOrDefault(3, 0)} ${map.getOrDefault(4, 0)} ${map.getOrDefault(5, 0)}")
}