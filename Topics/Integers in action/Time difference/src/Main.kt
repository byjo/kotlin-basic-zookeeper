fun main() {
    val firstHours = readln().toInt()
    val firstMinutes = readln().toInt()
    val firstSeconds = readln().toInt()
    val secondHours = readln().toInt()
    val secondMinutes = readln().toInt()
    val secondSeconds = readln().toInt()

    val diff = ((secondHours - firstHours) * 60 + secondMinutes - firstMinutes) * 60 + secondSeconds - firstSeconds
    println(diff)
}